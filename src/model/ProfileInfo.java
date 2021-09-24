/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java. util. Date;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
/**
 *
 * @author nidhitiwari
 */
public class ProfileInfo {
    
    private String name;
    private String geographicData;
    private Date dateOfBirth;
    private Long phoneNumber;
    private Long faxNumber;
    private String emailAddress;
    private String ssnNumber;
    private String medicalRecordNumber;
    private String healthPlanBeneficiaryNumber;
    private String bankAccountNums;
    private String licensePlate;
    private String licensePlateNum;
    private String deviceSerialNum;
    private String linkedinProfile;
    private String internetProtocolAddress;
    private Long fingerPrint;
    private String pathForImage;

    public String getPathForImage() {
        return pathForImage;
    }

    public void setPathForImage(String pathForImage) {
        this.pathForImage = pathForImage;
    }
    
    public void getImage() {
        JFrame editorFrame = new JFrame("Image Demo");
        BufferedImage image = null;
        try
        {
        image = ImageIO.read(new File(this.pathForImage));
        }
        catch (Exception e)
        {
        e.printStackTrace();
        System.exit(1);
        }
        ImageIcon imageIcon = new ImageIcon(fitimage(image, 500, 500));
        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

        editorFrame.pack();
        editorFrame.setLocationRelativeTo(null);
        editorFrame.setVisible(true);
    }
    
    private Image fitimage(Image img , int w , int h)
        {
            BufferedImage resizedimage = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = resizedimage.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(img, 0, 0,w,h,null);
            g2.dispose();
            return resizedimage;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(String geographicData) {
        this.geographicData = geographicData;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(Long faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSsnNumber() {
        return ssnNumber;
    }

    public void setSsnNumber(String ssnNumber) {
        this.ssnNumber = ssnNumber;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getHealthPlanBeneficiaryNumber() {
        return healthPlanBeneficiaryNumber;
    }

    public void setHealthPlanBeneficiaryNumber(String healthPlanBeneficiaryNumber) {
        this.healthPlanBeneficiaryNumber = healthPlanBeneficiaryNumber;
    }

    public String getBankAccountNums() {
        return bankAccountNums;
    }

    public void setBankAccountNums(String bankAccountNums) {
        this.bankAccountNums = bankAccountNums;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlateNum() {
        return licensePlateNum;
    }

    public void setLicensePlateNum(String licensePlateNum) {
        this.licensePlateNum = licensePlateNum;
    }

    public String getDeviceSerialNum() {
        return deviceSerialNum;
    }

    public void setDeviceSerialNum(String deviceSerialNum) {
        this.deviceSerialNum = deviceSerialNum;
    }

    public String getLinkedinProfile() {
        return linkedinProfile;
    }

    public void setLinkedinProfile(String linkedinProfile) {
        this.linkedinProfile = linkedinProfile;
    }

    public String getInternetProtocolAddress() {
        return internetProtocolAddress;
    }

    public void setInternetProtocolAddress(String internetProtocolAddress) {
        this.internetProtocolAddress = internetProtocolAddress;
    }

    public long getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(long fingerPrint) {
        this.fingerPrint = fingerPrint;
    }
}