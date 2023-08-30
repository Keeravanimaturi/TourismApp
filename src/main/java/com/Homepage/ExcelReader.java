package com.Homepage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {

    public void readData() {
        String path = "C:\\Users\\Admin\\Downloads\\Data.xlsx";

        List<Customer> customerList = new ArrayList<>();

        try (FileInputStream inputStream = new FileInputStream(path);
             Workbook workbook = new XSSFWorkbook(inputStream)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

            for (Row row : sheet) {
                Cell fullNameCell = row.getCell(0);
                Cell phoneNumberCell = row.getCell(1);
                Cell emailCell = row.getCell(2);

                String fullName = fullNameCell.getStringCellValue();
                String phoneNumberStr = "";

                if (phoneNumberCell.getCellType() == CellType.STRING) {
                    phoneNumberStr = phoneNumberCell.getStringCellValue();
                } else if (phoneNumberCell.getCellType() == CellType.NUMERIC) {
                    double numericValue = phoneNumberCell.getNumericCellValue();
                    phoneNumberStr = String.valueOf((long) numericValue);
                }

                if (!phoneNumberStr.isEmpty()) {
                    long phoneNumber = Long.parseLong(phoneNumberStr);
                    String email = emailCell.getStringCellValue();

                    Customer customer = new Customer(fullName, phoneNumber, email);
                    customerList.add(customer);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Now you have a list of customer objects, you can process it further
        for (Customer customer : customerList) {
            System.out.println("Full Name: " + customer.getFullname());
            System.out.println("Phone Number: " + customer.getPhonenumber());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("-------------------");
        }
    }

    // Rest of the class
}
