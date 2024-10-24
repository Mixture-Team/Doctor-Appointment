import 'package:app/styles/colors.dart';
import 'package:app/ui/screens/HomeScreen.dart';
import 'package:app/ui/widgets/HeaderWidget.dart';
import 'package:app/ui/widgets/NavigationBarWidget.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'SpecializationDetailScreen.dart';

class SpecializationScreen extends StatelessWidget {
  const SpecializationScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        body: Column(
          children: <Widget>[
            SizedBox(
              height: 65,
              child: HeaderWidget(
                isHomeScreen: false,
                onIconPressed: () {
                  Navigator.of(context).pop(
                      CupertinoPageRoute(builder: (context) => const HomeScreen()),
                  );
                },
              ),
            ),
            Expanded(
              child: SingleChildScrollView(
                child: Padding(
                  padding: const EdgeInsets.all(16.0),
                  child: GridView.count(
                    shrinkWrap: true,
                    physics: const NeverScrollableScrollPhysics(),
                    crossAxisCount: 2,
                    crossAxisSpacing: 16.0,
                    mainAxisSpacing: 16.0,
                    children: [
                      _buildSpecializationItem(
                          context,
                          'Cơ Xương Khớp',
                          'assets/images/Joints Bone.png'
                      ),
                      _buildSpecializationItem(
                          context,
                          'Thần kinh',
                          'assets/images/Brain.png'
                      ),
                      _buildSpecializationItem(
                          context,
                          'Răng',
                          'assets/images/Tooth.png'
                      ),
                      _buildSpecializationItem(
                          context,
                          'Phổi',
                          'assets/images/Lungs.png'
                      ),
                      _buildSpecializationItem(
                          context,
                          'Cơ Xương Khớp',
                          'assets/images/Joints Bone.png'
                      ),
                      _buildSpecializationItem(
                          context,
                          'Thần kinh',
                          'assets/images/Brain.png'
                      ),
                      _buildSpecializationItem(
                          context,
                          'Răng',
                          'assets/images/Tooth.png'
                      ),
                      _buildSpecializationItem(
                          context,
                          'Phổi',
                          'assets/images/Lungs.png'
                      ),
                      _buildSpecializationItem(
                          context,
                          'Cơ Xương Khớp',
                          'assets/images/Joints Bone.png'
                      ),
                      _buildSpecializationItem(
                          context,
                          'Thần kinh',
                          'assets/images/Brain.png'
                      ),
                      _buildSpecializationItem(
                          context,
                          'Răng',
                          'assets/images/Tooth.png'
                      ),
                      _buildSpecializationItem(
                          context,
                          'Phổi',
                          'assets/images/Lungs.png'
                      ),
                    ],
                  ),
                ),
              ),
            ),
          ],
        ),
        // bottomNavigationBar: Container(
        //   height: 70,
        //   child: const NavigationBarWidget(),
        // ),
      ),
    );
  }

  Widget _buildSpecializationItem(BuildContext context, String name, String imagePath) {
    return GestureDetector(
      onTap: () {
        Navigator.push(
            context,
            CupertinoPageRoute(builder: (context) => const SpecializationDetailScreen())
        );
      },
      child: SizedBox(
        height: 150,
        child: Container(
          padding: const EdgeInsets.all(8.0),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            mainAxisSize: MainAxisSize.min,
            children: [
              Expanded(
                child: Container(
                  decoration: BoxDecoration(
                    color: AppColors.lightYellow,
                    borderRadius: BorderRadius.circular(8.0),
                    boxShadow: [
                      BoxShadow(
                        color: Colors.grey.withOpacity(0.2),
                        spreadRadius: 2,
                        blurRadius: 5,
                        offset: const Offset(0, 3),
                      ),
                    ],
                  ),
                  child: Center(
                    child: Image.asset(
                      imagePath,
                      height: 100,
                      width: 100,
                      fit: BoxFit.contain,
                    ),
                  ),
                ),
              ),
              const SizedBox(height: 8),
              Text(
                name,
                style: const TextStyle(
                  fontSize: 16,
                  fontWeight: FontWeight.bold,
                ),
                textAlign: TextAlign.center,
              ),
            ],
          ),
        ),
      ),
    );
  }
}