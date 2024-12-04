import React from "react";
import Logo from "../../../components/Form/Auth/Logo";
import ForgotPasswordForm from "./components/ForgotPasswordForm";

export default function ForgotPassword() {
    return (
        <div className="flex justify-center items-center min-h-screen bg-gradient-to-r from-primary-50 to-primary-200">
            <div className="w-full max-w-lg bg-white rounded-lg shadow-lg p-10">
                {/* Logo */}
                <Logo />

                {/* Title */}
                <h2 className="text-3xl font-bold text-center mb-6">Quên mật khẩu</h2>

                {/* Instruction Text */}
                <p className="text-center text-gray-600 mb-6">
                    Để khôi phục mật khẩu, vui lòng nhập email đã đăng ký để được cấp mật khẩu mới.
                </p>

                {/* Forgot Password Form */}
                <ForgotPasswordForm />

                {/* Back to Login Link */}
                <div className="text-center mt-6">
                    <a href="#" className="text-sm text-gray-600 hover:underline">
                        Trở về trang đăng nhập
                    </a>
                </div>
            </div>
        </div>
    );
}
