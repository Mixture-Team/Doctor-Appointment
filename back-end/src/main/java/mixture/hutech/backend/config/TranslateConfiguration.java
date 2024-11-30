package mixture.hutech.backend.config;

import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class TranslateConfiguration {

    public static Map<String, String> getViToEnSymptoms() {
        Map<String, String> viToEnSymptoms = new HashMap<>();

        viToEnSymptoms.put("ngứa", "itching");
        viToEnSymptoms.put("phát_ban", "skin_rash");
        viToEnSymptoms.put("nổi_mẩn_da", "nodal_skin_eruptions");
        viToEnSymptoms.put("hắt hơi liên tục", "continuous_sneezing");
        viToEnSymptoms.put("run_rẩy", "shivering");
        viToEnSymptoms.put("ớn_lạnh", "chills");
        viToEnSymptoms.put("đau_khớp", "joint_pain");
        viToEnSymptoms.put("đau_dạ_dày", "stomach_pain");
        viToEnSymptoms.put("axit_dạ_dày", "acidity");
        viToEnSymptoms.put("loét_lưỡi", "ulcers_on_tongue");
        viToEnSymptoms.put("teo_cơ", "muscle_wasting");
        viToEnSymptoms.put("nôn", "vomiting");
        viToEnSymptoms.put("tiểu_buốt", "burning_micturition");
        viToEnSymptoms.put("tiểu_lắt_nhắt", "spotting_urination");
        viToEnSymptoms.put("mệt_mỏi", "fatigue");
        viToEnSymptoms.put("tăng_cân", "weight_gain");
        viToEnSymptoms.put("lo_âu", "anxiety");
        viToEnSymptoms.put("tay_chân_lạnh", "cold_hands_and_feets");
        viToEnSymptoms.put("thay đổi tâm trạng", "mood_swings");
        viToEnSymptoms.put("sụt cân", "weight_loss");
        viToEnSymptoms.put("bồn chồn", "restlessness");
        viToEnSymptoms.put("uể oải", "lethargy");
        viToEnSymptoms.put("đốm trắng trong cổ họng", "patches_in_throat");
        viToEnSymptoms.put("đường huyết không đều", "irregular_sugar_level");
        viToEnSymptoms.put("ho", "cough");
        viToEnSymptoms.put("sốt_cao", "high_fever");
        viToEnSymptoms.put("mắt trũng", "sunken_eyes");
        viToEnSymptoms.put("khó thở", "breathlessness");
        viToEnSymptoms.put("đổ mồ hôi", "sweating");
        viToEnSymptoms.put("mất nước", "dehydration");
        viToEnSymptoms.put("khó tiêu", "indigestion");
        viToEnSymptoms.put("đau_đầu", "headache");
        viToEnSymptoms.put("da vàng", "yellowish_skin");
        viToEnSymptoms.put("nước tiểu sẫm màu", "dark_urine");
        viToEnSymptoms.put("buồn nôn", "nausea");
        viToEnSymptoms.put("chán ăn", "loss_of_appetite");
        viToEnSymptoms.put("đau sau mắt", "pain_behind_the_eyes");
        viToEnSymptoms.put("đau lưng", "back_pain");
        viToEnSymptoms.put("táo bón", "constipation");
        viToEnSymptoms.put("đau bụng", "abdominal_pain");
        viToEnSymptoms.put("tiêu chảy", "diarrhoea");
        viToEnSymptoms.put("sốt nhẹ", "mild_fever");
        viToEnSymptoms.put("nước tiểu vàng", "yellow_urine");
        viToEnSymptoms.put("vàng mắt", "yellowing_of_eyes");
        viToEnSymptoms.put("suy gan cấp", "acute_liver_failure");
        viToEnSymptoms.put("tích tụ dịch", "fluid_overload");
        viToEnSymptoms.put("sưng bụng", "swelling_of_stomach");
        viToEnSymptoms.put("sưng hạch bạch huyết", "swelled_lymph_nodes");
        viToEnSymptoms.put("mệt mỏi chung", "malaise");
        viToEnSymptoms.put("mờ và méo hình ảnh", "blurred_and_distorted_vision");
        viToEnSymptoms.put("đờm", "phlegm");
        viToEnSymptoms.put("kích ứng họng", "throat_irritation");
        viToEnSymptoms.put("đỏ mắt", "redness_of_eyes");
        viToEnSymptoms.put("áp lực xoang mũi", "sinus_pressure");
        viToEnSymptoms.put("chảy nước mũi", "runny_nose");
        viToEnSymptoms.put("nghẹt mũi", "congestion");
        viToEnSymptoms.put("đau ngực", "chest_pain");
        viToEnSymptoms.put("yếu chi", "weakness_in_limbs");
        viToEnSymptoms.put("tim đập nhanh", "fast_heart_rate");
        viToEnSymptoms.put("đau khi đi tiêu", "pain_during_bowel_movements");
        viToEnSymptoms.put("đau vùng hậu môn", "pain_in_anal_region");
        viToEnSymptoms.put("đi tiêu ra máu", "bloody_stool");
        viToEnSymptoms.put("kích ứng ở hậu môn", "irritation_in_anus");
        viToEnSymptoms.put("đau cổ", "neck_pain");
        viToEnSymptoms.put("chóng_mặt", "dizziness");
        viToEnSymptoms.put("chuột rút", "cramps");
        viToEnSymptoms.put("bầm tím", "bruising");
        viToEnSymptoms.put("béo phì", "obesity");
        viToEnSymptoms.put("sưng chân", "swollen_legs");
        viToEnSymptoms.put("sưng mạch máu", "swollen_blood_vessels");
        viToEnSymptoms.put("mặt và mắt sưng húp", "puffy_face_and_eyes");
        viToEnSymptoms.put("tuyến giáp to", "enlarged_thyroid");
        viToEnSymptoms.put("móng tay giòn", "brittle_nails");
        viToEnSymptoms.put("sưng tấy tứ chi", "swollen_extremeties");
        viToEnSymptoms.put("đói quá mức", "excessive_hunger");
        viToEnSymptoms.put("quan hệ ngoài hôn nhân", "extra_marital_contacts");
        viToEnSymptoms.put("môi khô và tê", "drying_and_tingling_lips");
        viToEnSymptoms.put("nói_lắp", "slurred_speech");
        viToEnSymptoms.put("đau đầu gối", "knee_pain");
        viToEnSymptoms.put("đau khớp háng", "hip_joint_pain");
        viToEnSymptoms.put("yếu cơ", "muscle_weakness");
        viToEnSymptoms.put("cứng cổ", "stiff_neck");
        viToEnSymptoms.put("sưng khớp", "swelling_joints");
        viToEnSymptoms.put("cứng khớp khi cử động", "movement_stiffness");
        viToEnSymptoms.put("chóng mặt quay cuồng", "spinning_movements");
        viToEnSymptoms.put("mất thăng bằng", "loss_of_balance");
        viToEnSymptoms.put("mất ổn định", "unsteadiness");
        viToEnSymptoms.put("yếu một bên cơ thể", "weakness_of_one_body_side");
        viToEnSymptoms.put("mất khứu giác", "loss_of_smell");
        viToEnSymptoms.put("khó chịu bàng quang", "bladder_discomfort");
        viToEnSymptoms.put("nước tiểu có mùi hôi", "foul_smell_of_urine");
        viToEnSymptoms.put("tiểu liên tục", "continuous_feel_of_urine");
        viToEnSymptoms.put("đầy hơi", "passage_of_gases");
        viToEnSymptoms.put("ngứa bên trong", "internal_itching");
        viToEnSymptoms.put("nhiễm độc", "toxic_look_(typhos)");
        viToEnSymptoms.put("trầm cảm", "depression");
        viToEnSymptoms.put("cáu gắt", "irritability");
        viToEnSymptoms.put("đau cơ", "muscle_pain");
        viToEnSymptoms.put("rối loạn cảm giác", "altered_sensorium");
        viToEnSymptoms.put("đốm đỏ trên cơ thể", "red_spots_over_body");
        viToEnSymptoms.put("đau bụng dưới", "belly_pain");
        viToEnSymptoms.put("kinh nguyệt bất thường", "abnormal_menstruation");
        viToEnSymptoms.put("mảng da mất màu", "dischromic_patches");
        viToEnSymptoms.put("chảy nước mắt", "watering_from_eyes");
        viToEnSymptoms.put("tăng cảm giác thèm ăn", "increased_appetite");
        viToEnSymptoms.put("tiểu nhiều", "polyuria");
        viToEnSymptoms.put("tiền sử gia đình", "family_history");
        viToEnSymptoms.put("đờm nhầy", "mucoid_sputum");
        viToEnSymptoms.put("đờm gỉ sắt", "rusty_sputum");
        viToEnSymptoms.put("thiếu tập trung", "lack_of_concentration");
        viToEnSymptoms.put("rối loạn thị giác", "visual_disturbances");
        viToEnSymptoms.put("truyền máu", "receiving_blood_transfusion");
        viToEnSymptoms.put("tiêm không vô trùng", "receiving_unsterile_injections");
        viToEnSymptoms.put("hôn mê", "coma");
        viToEnSymptoms.put("xuất huyết dạ dày", "stomach_bleeding");
        viToEnSymptoms.put("chướng bụng", "distention_of_abdomen");
        viToEnSymptoms.put("tiền sử nghiện rượu", "history_of_alcohol_consumption");
        viToEnSymptoms.put("tích nước", "fluid_overload.1");
        viToEnSymptoms.put("ho ra máu", "blood_in_sputum");
        viToEnSymptoms.put("tĩnh mạch nổi bắp chân", "prominent_veins_on_calf");
        viToEnSymptoms.put("hồi hộp", "palpitations");
        viToEnSymptoms.put("đau khi đi bộ", "painful_walking");
        viToEnSymptoms.put("mụn mủ", "pus_filled_pimples");
        viToEnSymptoms.put("mụn đầu đen", "blackheads");
        viToEnSymptoms.put("sẹo", "scurring");
        viToEnSymptoms.put("bong da", "skin_peeling");
        viToEnSymptoms.put("da bạc như vảy", "silver_like_dusting");
        viToEnSymptoms.put("rãnh móng tay", "small_dents_in_nails");
        viToEnSymptoms.put("viêm móng", "");
        viToEnSymptoms.put("phồng rộp", "bliinflammatory_nailsster");
        viToEnSymptoms.put("vết đỏ quanh mũi", "red_sore_around_nose");
        viToEnSymptoms.put("chảy mủ vàng", "yellow_crust_ooze");

        return viToEnSymptoms;
    }

    public static Map<String, String> getViToEnDiseases() {
        Map<String, String> viToEnDiseases = new HashMap<>();

        viToEnDiseases.put("chóng mặt tư thế", "(vertigo) Paroymsal  Positional Vertigo");
        viToEnDiseases.put("aids", "AIDS");
        viToEnDiseases.put("mụn trứng cá", "Acne");
        viToEnDiseases.put("viêm gan do rượu", "Alcoholic hepatitis");
        viToEnDiseases.put("dị ứng", "Allergy");
        viToEnDiseases.put("viêm khớp", "Arthritis");
        viToEnDiseases.put("hen phế quản", "Bronchial Asthma");
        viToEnDiseases.put("thoái hóa cột sống cổ", "Cervical spondylosis");
        viToEnDiseases.put("thủy đậu", "Chicken pox");
        viToEnDiseases.put("ứ mật mãn tính", "Chronic cholestasis");
        viToEnDiseases.put("cảm lạnh thông thường", "Common Cold");
        viToEnDiseases.put("sốt xuất huyết", "Dengue");
        viToEnDiseases.put("tiểu đường", "Diabetes");
        viToEnDiseases.put("trĩ", "Dimorphic hemmorhoids(piles)");
        viToEnDiseases.put("phản ứng thuốc", "Drug Reaction");
        viToEnDiseases.put("nhiễm nấm", "Fungal infection");
        viToEnDiseases.put("trào ngược dạ dày", "GERD");
        viToEnDiseases.put("viêm dạ dày ruột", "Gastroenteritis");
        viToEnDiseases.put("đau tim", "Heart attack");
        viToEnDiseases.put("viêm gan B", "Hepatitis B");
        viToEnDiseases.put("viêm gan C", "Hepatitis C");
        viToEnDiseases.put("viêm gan D", "Hepatitis D");
        viToEnDiseases.put("viêm gan E", "Hepatitis E");
        viToEnDiseases.put("cao huyết áp", "Hypertension");
        viToEnDiseases.put("cường giáp", "Hyperthyroidism");
        viToEnDiseases.put("hạ đường huyết", "Hypoglycemia");
        viToEnDiseases.put("suy giáp", "Hypothyroidism");
        viToEnDiseases.put("chốc lở", "Impetigo");
        viToEnDiseases.put("vàng da", "Jaundice");
        viToEnDiseases.put("sốt rét", "Malaria");
        viToEnDiseases.put("đau nửa đầu", "Migraine");
        viToEnDiseases.put("thoái hóa khớp", "Osteoarthristis");
        viToEnDiseases.put("xuất huyết não", "Paralysis (brain hemorrhage)");
        viToEnDiseases.put("loét dạ dày", "Peptic ulcer diseae");
        viToEnDiseases.put("viêm phổi", "Pneumonia");
        viToEnDiseases.put("vẩy nến", "Psoriasis");
        viToEnDiseases.put("lao", "Tuberculosis");
        viToEnDiseases.put("thương hàn", "Typhoid");
        viToEnDiseases.put("nhiễm trùng đường tiết niệu", "Urinary tract infection");
        viToEnDiseases.put("suy giãn tĩnh mạch", "Varicose veins");
        viToEnDiseases.put("viêm gan A", "hepatitis A");

        return viToEnDiseases;
    }

    public static Map<Integer, String> getDiseaseIdMapping() {
        Map<Integer, String> diseaseIdToNameMap = new HashMap<>();

        diseaseIdToNameMap.put(0, "(vertigo) Paroymsal  Positional Vertigo");
        diseaseIdToNameMap.put(1, "AIDS");
        diseaseIdToNameMap.put(2, "Acne");
        diseaseIdToNameMap.put(3, "Alcoholic hepatitis");
        diseaseIdToNameMap.put(4, "Allergy");
        diseaseIdToNameMap.put(5, "Arthritis");
        diseaseIdToNameMap.put(6, "Bronchial Asthma");
        diseaseIdToNameMap.put(7, "Cervical spondylosis");
        diseaseIdToNameMap.put(8, "Chicken pox");
        diseaseIdToNameMap.put(9, "Chronic cholestasis");
        diseaseIdToNameMap.put(10, "Common Cold");
        diseaseIdToNameMap.put(11, "Dengue");
        diseaseIdToNameMap.put(12, "Diabetes");
        diseaseIdToNameMap.put(13, "Dimorphic hemmorhoids(piles)");
        diseaseIdToNameMap.put(14, "Drug Reaction");
        diseaseIdToNameMap.put(15, "Fungal infection");
        diseaseIdToNameMap.put(16, "GERD");
        diseaseIdToNameMap.put(17, "Gastroenteritis");
        diseaseIdToNameMap.put(18, "Heart attack");
        diseaseIdToNameMap.put(19, "Hepatitis B");
        diseaseIdToNameMap.put(20, "Hepatitis C");
        diseaseIdToNameMap.put(21, "Hepatitis D");
        diseaseIdToNameMap.put(22, "Hepatitis E");
        diseaseIdToNameMap.put(23, "Hypertension");
        diseaseIdToNameMap.put(24, "Hyperthyroidism");
        diseaseIdToNameMap.put(25, "Hypoglycemia");
        diseaseIdToNameMap.put(26, "Hypothyroidism");
        diseaseIdToNameMap.put(27, "Impetigo");
        diseaseIdToNameMap.put(28, "Jaundice");
        diseaseIdToNameMap.put(29, "Malaria");
        diseaseIdToNameMap.put(30, "Migraine");
        diseaseIdToNameMap.put(31, "Osteoarthristis");
        diseaseIdToNameMap.put(32, "Paralysis (brain hemorrhage)");
        diseaseIdToNameMap.put(33, "Peptic ulcer diseae");
        diseaseIdToNameMap.put(34, "Pneumonia");
        diseaseIdToNameMap.put(35, "Psoriasis");
        diseaseIdToNameMap.put(36, "Tuberculosis");
        diseaseIdToNameMap.put(37, "Typhoid");
        diseaseIdToNameMap.put(38, "Urinary tract infection");
        diseaseIdToNameMap.put(39, "Varicose veins");
        diseaseIdToNameMap.put(40, "hepatitis A");

        return diseaseIdToNameMap;
    }
}
