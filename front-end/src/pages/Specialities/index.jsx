import React, { useEffect, useState } from 'react';
import axiosClient from '../../services/apis/axiosClient';
import Speciality from './components/Speciality';

export default function Specialities() {
  const [specialties, setSpecialties] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    // Hàm gọi API để lấy danh sách chuyên khoa
    const fetchSpecialties = async () => {
      try {
        const response = await axiosClient.get('specializations');
        const data = response.data;

        // Kiểm tra xem data có phải là mảng không
        if (Array.isArray(data.data)) {
          const specialtiesWithImage = data.data.map(specialty => ({
            ...specialty,
          }));
          setSpecialties(specialtiesWithImage); // Cập nhật dữ liệu chuyên khoa vào state
        } else {
          throw new Error('Dữ liệu API không hợp lệ');
        }
      } catch (error) {
        setError(error.message);
      } finally {
        setLoading(false); // Đã hoàn thành việc gọi API
      }
    };

    fetchSpecialties();
  }, []); // Chỉ gọi API khi component được mount

  if (loading) {
    return <div>Đang tải...</div>;
  }

  if (error) {
    return <div>Đã xảy ra lỗi: {error}</div>;
  }

  return (
      <main>
        <Speciality item={specialties} />
      </main>
  );
}
