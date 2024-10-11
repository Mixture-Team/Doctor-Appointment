import 'dart:convert';
import 'package:http/http.dart' as http;

class ProvinceGHNApiService{
  static const String baseUrl = 'https://dev-online-gateway.ghn.vn/shiip/public-api/master-data';
  static const String token = '6f15c88b-8731-11ef-8e53-0a00184fe694';

  static Map<String, String> get headers => {
    'Content-Type' : 'application/json',
    'token' : token
  };

  static Future<List<Map<String,dynamic>>>  getProvinces() async{
    final response = await http.get(
      Uri.parse('$baseUrl/province'),
      headers: headers
    );
    print(response.body);
    if(response.statusCode == 200){
      final jsonData = json.decode(utf8.decode(response.bodyBytes));
      return List<Map<String, dynamic>>.from(jsonData['data']);
    }
    else{
      throw Exception('Failed to load provinces');
    }
  }

  static Future<List<Map<String,dynamic>>>  getDistricts(int provinceId) async{
    final response = await http.post(
        Uri.parse('$baseUrl/district'),
        headers: headers,
        body: json.encode({'province_id' : provinceId})
    );
    if(response.statusCode == 200){
      final jsonData = json.decode(utf8.decode(response.bodyBytes));
      return List<Map<String, dynamic>>.from(jsonData['data']);
    }
    else{
      throw Exception('Failed to load districts');
    }
  }

  static Future<List<Map<String,dynamic>>>getWards(int districtId) async{
    final response = await http.post(
        Uri.parse('$baseUrl/ward?district_id$districtId'),
        headers: headers,
        body: json.encode({'district_id' : districtId})
    );
    if(response.statusCode == 200){
      final jsonData = json.decode(utf8.decode(response.bodyBytes));
      return List<Map<String, dynamic>>.from(jsonData['data']);
    }
    else{
      throw Exception('Failed to load wards');
    }
  }
}