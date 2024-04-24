//package org.example;
//
//import jdepend.xmlui.JDepend;
//import jdepend.swingui.JDependUI;
//
//import java.io.PrintWriter;
//import java.io.File;
//
//public class Main {
//
//    public static void main(String[] args) {
//        try {
//            // Bước 1: Xuất report của dự án ra file XML
//            exportReportToXML("T:\\VoVanHai\\Library-Assistant");
//
//            // Bước 2: Sử dụng JDepend-UI để tạo report HTML từ file XML
//            generateHTMLReport("T:\\VoVanHai\\Library-Assistant\\reports\\report.xml");
//
//            // Bước 3: Xem gói Java bằng UI
//            viewJavaPackageWithUI("T:\\VoVanHai\\Library-Assistant");
//
//            System.out.println("DONE");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void exportReportToXML(String projectDirectory) throws Exception {
//        JDepend depend = new JDepend(new PrintWriter(projectDirectory + "\\reports\\report.xml"));
//        depend.addDirectory(projectDirectory);
//        depend.analyze();
//    }
//
//    private static void generateHTMLReport(String xmlReportPath) throws Exception {
//        // Gọi npm run jdepend-ui để tạo report HTML
//        String command = "npm run jdepend-ui " + xmlReportPath + " be";
//        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", command);
//        processBuilder.directory(new File("T:\\jdepend-ui"));
//        Process process = processBuilder.start();
//        process.waitFor();
//    }
//
//    private static void viewJavaPackageWithUI(String projectDirectory) {
//        try {
//            // Tạo một đối tượng JDependUI từ JDepend
//            JDependUI jDependUI = new JDependUI();
//
//            // Thêm gói cần phân tích vào JDependUI
//            jDependUI.addDirectory(projectDirectory);
//
//            // Hiển thị giao diện người dùng
//            jDependUI.show();
//
//            System.out.println("DONE");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
////
////import jdepend.xmlui.JDepend;
////
////import java.io.PrintWriter;
////
////public class Main {
//////    public static void main(String[] args) {
//////        System.out.println("Hello world!");
//////    }
////    public static void main(String[] args) throws Exception{
////        JDepend depend =new JDepend(new PrintWriter("report.xml"));
////        depend.addDirectory("E:\\www\\Library-Assistant");
////        depend.analyze();
////        System.out.println("DONE");
////    }
////}
