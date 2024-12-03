import React from 'react';
import DoctorCard from './DoctorCard';
import PropTypes from 'prop-types';

export default function Doctors({ item }) {
    return (
        <div className="container mx-auto p-4">
            <h1 className="text-xl font-bold mb-4 md:text-2xl">Danh sách bác sĩ</h1>
            <div className="grid grid-cols-1 md:grid-cols-3 gap-4">
                {item.map((doctor) => (
                    <DoctorCard
                        key={doctor.doctor_id}
                        name={doctor.doctor_name}
                        imageUrl={require(`../../../../${doctor.doctor_image}`)}
                        specialty={doctor.specialization_name}
                    />
                ))}
            </div>
        </div>
    );
}

Doctors.propTypes = {
    item: PropTypes.arrayOf(
        PropTypes.shape({
            doctor_id: PropTypes.string.isRequired,
            doctor_name: PropTypes.string.isRequired,
            doctor_image: PropTypes.string.isRequired,
            specialization_name: PropTypes.string.isRequired
        })
    ).isRequired
};
