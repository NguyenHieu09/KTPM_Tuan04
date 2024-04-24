package org.example;

import jdepend.xmlui.JDepend;

import java.io.File;
import java.io.PrintWriter;

public class AutoExecute {
    public static void main(String[] args) {
        try {
            // Bước 1: Xuất report của dự án ra file XML
            exportReportToXML("E:\\www\\Library-Assistant");

            // Bước 2: Sử dụng JDepend-UI để tạo report HTML từ file XML
            generateHTMLReport("E:\\www\\mainSequence\\report1.xml");

            // Bước 3: Xem gói Java bằng UI
            viewJavaPackageWithUI("E:\\www\\Library-Assistant");

            System.out.println("DONE");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void exportReportToXML(String projectDirectory) throws Exception {
        JDepend depend = new JDepend(new PrintWriter("report1.xml"));
        depend.addDirectory(projectDirectory);
        depend.analyze();
    }

    private static void generateHTMLReport(String xmlReportPath) throws Exception {

        String command = "npm run jdepend-ui " + xmlReportPath + " be";
        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", command);
        processBuilder.directory(new File("E:\\www\\jdepend-ui"));
        Process process = processBuilder.start();
        process.waitFor();
    }

    private static void viewJavaPackageWithUI(String projectDirectory) {
        try {
            // Tạo một đối tượng JDepend từ JDependUI
            jdepend.swingui.JDepend depend = new jdepend.swingui.JDepend();
            depend.addDirectory(projectDirectory);
            depend.analyze();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
