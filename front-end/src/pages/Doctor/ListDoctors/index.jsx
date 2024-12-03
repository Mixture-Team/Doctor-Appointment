import React, { useEffect, useState } from 'react';
import axiosClient from '../../../services/apis/axiosClient';
import Doctors from './components/Doctors';

export default function ListDoctors() {
  const [doctors, setDoctors] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    const fetchDoctors = async () => {
      try {
        const response = await axiosClient.get('doctors'); // Đường dẫn API
        const data = response.data;

        // Kiểm tra dữ liệu trả về
        if (Array.isArray(data.data)) {
          // Cập nhật danh sách bác sĩ với đường dẫn ảnh đúng
          const formattedDoctors = data.data.map(doctor => ({
            ...doctor,
          }));
          setDoctors(formattedDoctors);
        } else {
          throw new Error('Dữ liệu API không hợp lệ');
        }
      } catch (err) {
        setError(err.message);
      } finally {
        setLoading(false);
      }
    };

    fetchDoctors();
  }, []);

  if (loading) {
    return <div>Đang tải...</div>;
  }

  if (error) {
    return <div>Đã xảy ra lỗi: {error}</div>;
  }

  return (
      <main>
        <Doctors item={doctors} />
      </main>
  );
}
