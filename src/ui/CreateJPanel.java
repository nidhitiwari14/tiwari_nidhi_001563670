/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.ProfileInfo;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author nidhitiwari
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form CreateJPanel
    */
    ProfileInfo profileInfo;
    public Boolean isFormValid = false;
    public String errorFieldEmpty = "Form";
    public String errorMessage = "";

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(ProfileInfo profileInfo) {
        initComponents();
        
        this.profileInfo = profileInfo;
        btnSave.setEnabled(false);
        
    }
    
    private void validateForm() {
        if((txtContactNumber.getText().isEmpty())) {
            isFormValid = false;
            errorFieldEmpty = "Contact Number";
        } 
        else if (txtName.getText().isEmpty()) {
            isFormValid = false;
            errorFieldEmpty = "First Name";
        }
        else if (txtLastName.getText().isEmpty()) {
            isFormValid = false;
            errorFieldEmpty = "Last Name";
        }
        else if (txtGeographicalData.getText().isEmpty()) {
            isFormValid = false;
            errorFieldEmpty = "Address";
        }
        else if (txtCity.getText().isEmpty()) {
            isFormValid = false;
            errorFieldEmpty = "City";
        }
        else if (txtStateCode.getText().isEmpty()) {
            isFormValid = false;
            errorFieldEmpty = "State";
        }
        else if (txtZip.getText().isEmpty()) {
            isFormValid = false;
            errorFieldEmpty = "Zip";
        }
        else if (txtEmailAddr.getText().isEmpty()) {
            isFormValid = false;
            errorFieldEmpty = "Email";
        }
        else {
            isFormValid = true;
            btnSave.setEnabled(true);
        } 
    }
    
    public void onSaveButtonClickValidation() {
        validateForm();
        String emailAddressVAlidation = "^[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
            if (txtEmailAddr.getText().matches(emailAddressVAlidation))
            {
                lblEmailAddressValidation.setText("");
            }
            else
            {
                lblEmailAddressValidation.setText("Email Address Format is Invalid");
            }
        if (txtContactNumber.getText().length() != 10) {
            isFormValid = false;
            errorMessage = "Phone is not valid";
            lblContactNumValidation.setText(errorMessage);
        }
        if (!txtFaxNum.getText().isEmpty() && txtFaxNum.getText().toString().length() != 10) {
            isFormValid = false;
            errorMessage = "Fax is not valid";
            lblFaxNumValidation.setText(errorMessage);
        }
        if (!txtSSNNum.getText().isEmpty()) {
            if (!Pattern.matches("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$", txtSSNNum.getText())) {
                isFormValid = false;
                errorMessage = "SSN Number is not valid";
                lblSSNNumValidation.setText(errorMessage);
            }
        }
        if (!txtDateOfBirth.getText().isEmpty()) {
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            try
                {
                    formatter.parse(txtDateOfBirth.getText());
                    lblDateValidation.setText("");
                }
	    
                catch (Exception e)
                {
                    lblDateValidation.setText("Date Format is Invalid");
                    isFormValid = false;
                }
        }
        if (isFormValid == true) {
            isFormValid = true;
            profileInfo.setName(txtName.getText());
            profileInfo.setMiddleName(txtMiddleName.getText());
            profileInfo.setLastName(txtLastName.getText());
            profileInfo.setGeographicData(txtGeographicalData.getText());
            profileInfo.setCity(txtCity.getText());
            profileInfo.setState(txtStateCode.getText());
            try {
                profileInfo.setZip(Long.parseLong(txtZip.getText()));
            } catch(Exception e) {
            }
            profileInfo.setDateOfBirth(txtDateOfBirth.getText());
            try {
                profileInfo.setPhoneNumber(Long.parseLong(txtContactNumber.getText()));
            } catch(Exception e) {
            }
            try {
                profileInfo.setFaxNumber(Long.parseLong(txtFaxNum.getText()));
            } catch(Exception e) {
            }
            profileInfo.setEmailAddress(txtEmailAddr.getText());
            profileInfo.setSsnNumber(txtSSNNum.getText());
            //profileInfo.setBankAccountNums(Arrays.toString(txtBankAccountNum.getText()));
            try {
                profileInfo.setBankAccountNums(Long.parseLong(txtBankAccountNum.getText()));
            } catch(Exception e) {
            }
            profileInfo.setDeviceSerialNum(txtDeviceSerialNum.getText());
            profileInfo.setHealthPlanBeneficiaryNumber(txtHealthPlanBenNum.getText());
            profileInfo.setInternetProtocolAddress(txtIPAddr.getText());
            profileInfo.setLicensePlateNum(txtLicensePlateNum.getText());
            profileInfo.setMedicalRecordNumber(txtMedicalRecNum.getText());
            profileInfo.setLinkedinProfile(txtLinkedin.getText());

            JOptionPane.showMessageDialog(this, "Profile Information Saved.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGeographicalData = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        lblContactNum = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGeographicalData = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblFaxNum = new javax.swing.JLabel();
        txtFaxNum = new javax.swing.JTextField();
        lblEmailAddr = new javax.swing.JLabel();
        txtEmailAddr = new javax.swing.JTextField();
        lblSSNNum = new javax.swing.JLabel();
        txtSSNNum = new javax.swing.JTextField();
        lblMedicalRecNum = new javax.swing.JLabel();
        txtMedicalRecNum = new javax.swing.JTextField();
        lblHealthPlanBenNum = new javax.swing.JLabel();
        txtHealthPlanBenNum = new javax.swing.JTextField();
        lblBankAccountNum = new javax.swing.JLabel();
        txtBankAccountNum = new javax.swing.JTextField();
        lblLicensePlateNum = new javax.swing.JLabel();
        txtLicensePlateNum = new javax.swing.JTextField();
        lblDeviceSerialNum = new javax.swing.JLabel();
        txtDeviceSerialNum = new javax.swing.JTextField();
        lblLinkedin = new javax.swing.JLabel();
        txtLinkedin = new javax.swing.JTextField();
        lblIPAddr = new javax.swing.JLabel();
        txtIPAddr = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        lblFaxNumValidation = new javax.swing.JLabel();
        lblContactNumValidation = new javax.swing.JLabel();
        lblDateOfBirthValidation = new javax.swing.JLabel();
        lblNameValidation = new javax.swing.JLabel();
        lblSSNNumValidation = new javax.swing.JLabel();
        btnUploadImage = new javax.swing.JButton();
        lblMandatoryInstruction = new javax.swing.JLabel();
        lblMiddleName = new javax.swing.JLabel();
        txtMiddleName = new javax.swing.JTextField();
        lblNameValidation1 = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblDOBFormat = new javax.swing.JLabel();
        lblContactFormat = new javax.swing.JLabel();
        lblFaxNumFormat = new javax.swing.JLabel();
        lblSSNNumFormat = new javax.swing.JLabel();
        lblBankAccNumFormat = new javax.swing.JLabel();
        lblLastNameValidation = new javax.swing.JLabel();
        lblGeographicalData1 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        lblStateCode = new javax.swing.JLabel();
        txtStateCode = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        lblMiddleNameValidation = new javax.swing.JLabel();
        lblAddressValidation = new javax.swing.JLabel();
        lblDateValidation = new javax.swing.JLabel();
        lblBankAccountNumValidation = new javax.swing.JLabel();
        lblEmailAddressValidation = new javax.swing.JLabel();
        lblImageConfirmation = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Profile");

        lblName.setText("First Name*:");

        lblGeographicalData.setText("Street Address*:");

        lblDateOfBirth.setText("Date Of Birth:");

        lblContactNum.setText("Contact Number*:");

        txtName.setToolTipText("Enter First Name");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });
        txtDateOfBirth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDateOfBirthKeyPressed(evt);
            }
        });

        txtContactNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactNumberKeyPressed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblFaxNum.setText("Fax Number:");

        txtFaxNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxNumActionPerformed(evt);
            }
        });
        txtFaxNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFaxNumKeyPressed(evt);
            }
        });

        lblEmailAddr.setText("Email Address*:");

        txtEmailAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddrActionPerformed(evt);
            }
        });
        txtEmailAddr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailAddrKeyPressed(evt);
            }
        });

        lblSSNNum.setText("  SSN Number:");

        txtSSNNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNNumActionPerformed(evt);
            }
        });
        txtSSNNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSSNNumKeyPressed(evt);
            }
        });

        lblMedicalRecNum.setText("Medical Record Number:");

        txtMedicalRecNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicalRecNumActionPerformed(evt);
            }
        });

        lblHealthPlanBenNum.setText("Health Plan Benificiary Num:");

        txtHealthPlanBenNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthPlanBenNumActionPerformed(evt);
            }
        });

        lblBankAccountNum.setText("Bank Account Number:");

        txtBankAccountNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankAccountNumActionPerformed(evt);
            }
        });
        txtBankAccountNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBankAccountNumKeyPressed(evt);
            }
        });

        lblLicensePlateNum.setText("Vehicle Certificate/License Plate Number:");

        txtLicensePlateNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicensePlateNumActionPerformed(evt);
            }
        });

        lblDeviceSerialNum.setText("Device Serial Number:");

        txtDeviceSerialNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeviceSerialNumActionPerformed(evt);
            }
        });

        lblLinkedin.setText("Linkedin Profile Url:");

        txtLinkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkedinActionPerformed(evt);
            }
        });

        lblIPAddr.setText("Internet Protocol Address:");

        txtIPAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIPAddrActionPerformed(evt);
            }
        });

        lblImage.setText("Profile Image*:");

        btnUploadImage.setText("Upload Image");
        btnUploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadImageActionPerformed(evt);
            }
        });

        lblMandatoryInstruction.setText("Fields marked with * are mandatory");

        lblMiddleName.setText("Middle Name:");

        txtMiddleName.setToolTipText("Enter First Name");
        txtMiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMiddleNameActionPerformed(evt);
            }
        });
        txtMiddleName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMiddleNameKeyPressed(evt);
            }
        });

        lblLastName.setText("Last Name*:");

        txtLastName.setToolTipText("Enter First Name");
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLastNameKeyPressed(evt);
            }
        });

        lblDOBFormat.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        lblDOBFormat.setText("Format MM/dd/yyyy");

        lblContactFormat.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        lblContactFormat.setText("Numbers Only And Max Limit is 10 digit");

        lblFaxNumFormat.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        lblFaxNumFormat.setText("Numbers Only and Max Limit is 10 Digit");

        lblSSNNumFormat.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        lblSSNNumFormat.setText("Format XXX-XX-XXXX");

        lblBankAccNumFormat.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        lblBankAccNumFormat.setText("Numbers Only");

        lblGeographicalData1.setText("City*:");

        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityKeyPressed(evt);
            }
        });

        lblZip.setText("Zip*:");

        lblStateCode.setText("State Code*:");

        txtStateCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStateCodeKeyPressed(evt);
            }
        });

        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });
        txtZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtZipKeyPressed(evt);
            }
        });

        lblAddressValidation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(lblMandatoryInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(244, 244, 244))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGeographicalData1)
                            .addComponent(lblBankAccountNum)
                            .addComponent(lblLicensePlateNum)
                            .addComponent(lblDeviceSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLinkedin)
                            .addComponent(lblIPAddr)
                            .addComponent(lblMedicalRecNum)
                            .addComponent(lblEmailAddr)
                            .addComponent(lblFaxNum)
                            .addComponent(lblDateOfBirth)
                            .addComponent(lblGeographicalData)
                            .addComponent(lblName)
                            .addComponent(lblHealthPlanBenNum)
                            .addComponent(lblContactNum)
                            .addComponent(lblSSNNum)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMiddleName)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lblLastName)))
                            .addComponent(lblImage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGeographicalData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblStateCode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStateCode, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblZip)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContactNumValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNameValidation)
                                            .addComponent(lblDateOfBirthValidation)
                                            .addComponent(lblFaxNumValidation)
                                            .addComponent(lblSSNNumValidation))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lblAddressValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtMiddleName, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                                            .addComponent(txtLastName))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNameValidation1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMiddleNameValidation))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(407, 407, 407)
                                        .addComponent(lblLastNameValidation))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDOBFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblBankAccNumFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFaxNumFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblContactFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSSNNumFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                    .addComponent(txtFaxNum, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                    .addComponent(txtSSNNum, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                    .addComponent(txtMedicalRecNum, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                    .addComponent(txtHealthPlanBenNum, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                    .addComponent(txtLicensePlateNum, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                    .addComponent(txtDeviceSerialNum, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                    .addComponent(txtLinkedin, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                    .addComponent(txtIPAddr, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(lblDateValidation))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBankAccountNum, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                        .addGap(27, 27, 27)
                                        .addComponent(lblBankAccountNumValidation))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEmailAddr, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                                        .addGap(27, 27, 27)
                                        .addComponent(lblEmailAddressValidation))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(lblImageConfirmation)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBankAccountNum, txtContactNumber, txtDateOfBirth, txtDeviceSerialNum, txtEmailAddr, txtFaxNum, txtGeographicalData, txtHealthPlanBenNum, txtIPAddr, txtLastName, txtLicensePlateNum, txtLinkedin, txtMedicalRecNum, txtMiddleName, txtName, txtSSNNum});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblDateOfBirthValidation, lblFaxNumValidation, lblNameValidation, lblSSNNumValidation});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(2, 2, 2)
                .addComponent(lblMandatoryInstruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(lblNameValidation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMiddleName)
                    .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameValidation1)
                    .addComponent(lblMiddleNameValidation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastNameValidation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeographicalData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGeographicalData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeographicalData1)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStateCode)
                    .addComponent(txtStateCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZip)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddressValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateOfBirth)
                    .addComponent(lblDateOfBirthValidation)
                    .addComponent(lblDateValidation))
                .addGap(3, 3, 3)
                .addComponent(lblDOBFormat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactNum)
                    .addComponent(lblContactNumValidation))
                .addGap(3, 3, 3)
                .addComponent(lblContactFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFaxNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaxNum)
                    .addComponent(lblFaxNumValidation))
                .addGap(3, 3, 3)
                .addComponent(lblFaxNumFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailAddr)
                    .addComponent(txtEmailAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailAddressValidation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSSNNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSSNNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSSNNumValidation))
                .addGap(3, 3, 3)
                .addComponent(lblSSNNumFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedicalRecNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedicalRecNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHealthPlanBenNum)
                    .addComponent(txtHealthPlanBenNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankAccountNum)
                    .addComponent(txtBankAccountNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBankAccountNumValidation))
                .addGap(3, 3, 3)
                .addComponent(lblBankAccNumFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicensePlateNum)
                    .addComponent(txtLicensePlateNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeviceSerialNum)
                    .addComponent(txtDeviceSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedin)
                    .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIPAddr)
                    .addComponent(txtIPAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImage)
                    .addComponent(btnUploadImage)
                    .addComponent(lblImageConfirmation))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(68, 68, 68))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBankAccountNum, txtContactNumber, txtDateOfBirth, txtDeviceSerialNum, txtEmailAddr, txtFaxNum, txtGeographicalData, txtHealthPlanBenNum, txtIPAddr, txtLastName, txtLicensePlateNum, txtLinkedin, txtMedicalRecNum, txtMiddleName, txtName, txtSSNNum});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblContactNumValidation, lblDateOfBirthValidation, lblFaxNumValidation, lblNameValidation, lblSSNNumValidation});

    }// </editor-fold>//GEN-END:initComponents

    private void txtIPAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIPAddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIPAddrActionPerformed

    private void txtLinkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkedinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedinActionPerformed

    private void txtDeviceSerialNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeviceSerialNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeviceSerialNumActionPerformed

    private void txtLicensePlateNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicensePlateNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicensePlateNumActionPerformed

    private void txtBankAccountNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankAccountNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankAccountNumActionPerformed

    private void txtHealthPlanBenNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthPlanBenNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthPlanBenNumActionPerformed

    private void txtMedicalRecNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicalRecNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalRecNumActionPerformed

    private void txtSSNNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNNumActionPerformed

    private void txtEmailAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddrActionPerformed

    private void txtFaxNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxNumActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        onSaveButtonClickValidation();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void txtFaxNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFaxNumKeyPressed
        // TODO add your handling code here:
        // Event KeyPressed
        validateForm();
        char NumPressed = evt.getKeyChar();
        if(Character.isLetter(NumPressed)){
            isFormValid = false;
            txtFaxNum.setEditable(false);
            lblFaxNumValidation.setText("Please enter number Only!");
            validateForm();
        }
        else
        {
            txtFaxNum.setEditable(true);
            isFormValid = true;
            lblFaxNumValidation.setText("");
            validateForm();
        }
    }//GEN-LAST:event_txtFaxNumKeyPressed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        // Event KeyPressed
        validateForm();
        char letterPressed = evt.getKeyChar();
        if(Character.isDigit(letterPressed)){
        isFormValid = false;
        txtName.setEditable(false);
        lblNameValidation.setText("Please enter letters only!");
        validateForm();
        }
        else
        {
        txtName.setEditable(true);
        isFormValid = true;
        lblNameValidation.setText("");
        validateForm();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtSSNNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSNNumKeyPressed
        // TODO add your handling code here:
        // Event KeyPressed
        validateForm();
        char NumPressed = evt.getKeyChar();
        if(Character.isLetter(NumPressed)){
            isFormValid = false;
            txtSSNNum.setEditable(false);
            lblSSNNumValidation.setText("Please enter number Only!");
            validateForm();
        }
        else
        {
            txtSSNNum.setEditable(true);
            isFormValid = true;
            lblSSNNumValidation.setText("");
            validateForm();
        }
    }//GEN-LAST:event_txtSSNNumKeyPressed

    private void txtContactNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNumberKeyPressed
        // TODO add your handling code here:
        // Event KeyPressed
        validateForm();
        char NumPressed = evt.getKeyChar();
        if(Character.isLetter(NumPressed)){
            isFormValid = false;
            txtContactNumber.setEditable(false);
            lblContactNumValidation.setText("Please enter number Only!");
            validateForm();
        }
        else
        {
            txtContactNumber.setEditable(true);
            isFormValid = true;
            lblContactNumValidation.setText("");
            validateForm();
        }
    }//GEN-LAST:event_txtContactNumberKeyPressed

    private void txtDateOfBirthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateOfBirthKeyPressed

    }//GEN-LAST:event_txtDateOfBirthKeyPressed

    private void btnUploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImageActionPerformed
      // TODO add your handling code here:
      BiometricDetails BioMetricImage = new BiometricDetails();
      String profileImagePath = BioMetricImage.loadProfileImage();        
      try {
          profileInfo.setPathForImage(profileImagePath);
          lblImageConfirmation.setText("Image is Uploaded");
      } catch(Exception e) {
          lblImageConfirmation.setText("Error occurred while uploading Image");
      }
    }//GEN-LAST:event_btnUploadImageActionPerformed

    private void txtMiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMiddleNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtMiddleNameActionPerformed

    private void txtMiddleNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMiddleNameKeyPressed
        // TODO add your handling code here:
        // Event KeyPressed
        validateForm();
        char letterPressed = evt.getKeyChar();
        if(Character.isDigit(letterPressed)){
        isFormValid = false;
        txtMiddleName.setEditable(false);
        lblMiddleNameValidation.setText("Please enter letters only!");
        validateForm();
        }
        else
        {
        txtMiddleName.setEditable(true);
        isFormValid = true;
        lblMiddleNameValidation.setText("");
        validateForm();
        }
    }//GEN-LAST:event_txtMiddleNameKeyPressed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyPressed
        // TODO add your handling code here:
        // Event KeyPressed
        validateForm();
        char letterPressed = evt.getKeyChar();
        if(Character.isDigit(letterPressed)){
        isFormValid = false;
        txtLastName.setEditable(false);
        lblLastNameValidation.setText("Please enter letters only!");
        validateForm();
        }
        else
        {
        txtLastName.setEditable(true);
        isFormValid = true;
        lblLastNameValidation.setText("");
        validateForm();
        }
    }//GEN-LAST:event_txtLastNameKeyPressed

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipActionPerformed

    private void txtCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyPressed
        // TODO add your handling code here:
        // Event KeyPressed
        validateForm();
        lblAddressValidation.setText("");
        txtStateCode.setEditable(true);
        txtCity.setEditable(true);
        txtZip.setEditable(true);
        char letterPressed = evt.getKeyChar();
        if(Character.isDigit(letterPressed)){
        isFormValid = false;
        txtCity.setEditable(false);
        lblAddressValidation.setText("Please enter letters only!");
        validateForm();
        }
        else
        {
        txtCity.setEditable(true);
        isFormValid = true;
        lblAddressValidation.setText("");
        validateForm();
        }
    }//GEN-LAST:event_txtCityKeyPressed

    private void txtStateCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateCodeKeyPressed
        // TODO add your handling code here:
        validateForm();
        char letterPressed = evt.getKeyChar();
        lblAddressValidation.setText("");
        txtStateCode.setEditable(true);
        txtCity.setEditable(true);
        txtZip.setEditable(true);
        if(Character.isDigit(letterPressed)){
        isFormValid = false;
        txtStateCode.setEditable(false);
        lblAddressValidation.setText("Please enter letters only!");
        validateForm();
        }
        else
        {
        txtStateCode.setEditable(true);
        isFormValid = true;
        lblAddressValidation.setText("");
        validateForm();
        }
    }//GEN-LAST:event_txtStateCodeKeyPressed

    private void txtZipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyPressed
        // TODO add your handling code here:
        validateForm();
        char NumPressed = evt.getKeyChar();
        lblAddressValidation.setText("");
        txtStateCode.setEditable(true);
        txtCity.setEditable(true);
        txtZip.setEditable(true);
        if(Character.isLetter(NumPressed)){
            isFormValid = false;
            txtZip.setEditable(false);
            lblAddressValidation.setText("Please enter number Only!");
            validateForm();
        }
        else
        {
            txtZip.setEditable(true);
            lblAddressValidation.setText("");
            validateForm();
        }
    }//GEN-LAST:event_txtZipKeyPressed

    private void txtBankAccountNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBankAccountNumKeyPressed
        // TODO add your handling code here:
        validateForm();
        char NumPressed = evt.getKeyChar();
        if(Character.isLetter(NumPressed)){
            isFormValid = false;
            txtBankAccountNum.setEditable(false);
            lblBankAccountNumValidation.setText("Please enter number Only!");
            validateForm();
        }
        else
        {
            txtBankAccountNum.setEditable(true);
            lblBankAccountNumValidation.setText("");
            validateForm();
        }
    }//GEN-LAST:event_txtBankAccountNumKeyPressed

    private void txtEmailAddrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailAddrKeyPressed
        // TODO add your handling code here:
        validateForm();
    }//GEN-LAST:event_txtEmailAddrKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUploadImage;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAddressValidation;
    private javax.swing.JLabel lblBankAccNumFormat;
    private javax.swing.JLabel lblBankAccountNum;
    private javax.swing.JLabel lblBankAccountNumValidation;
    private javax.swing.JLabel lblContactFormat;
    private javax.swing.JLabel lblContactNum;
    private javax.swing.JLabel lblContactNumValidation;
    private javax.swing.JLabel lblDOBFormat;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDateOfBirthValidation;
    private javax.swing.JLabel lblDateValidation;
    private javax.swing.JLabel lblDeviceSerialNum;
    private javax.swing.JLabel lblEmailAddr;
    private javax.swing.JLabel lblEmailAddressValidation;
    private javax.swing.JLabel lblFaxNum;
    private javax.swing.JLabel lblFaxNumFormat;
    private javax.swing.JLabel lblFaxNumValidation;
    private javax.swing.JLabel lblGeographicalData;
    private javax.swing.JLabel lblGeographicalData1;
    private javax.swing.JLabel lblHealthPlanBenNum;
    private javax.swing.JLabel lblIPAddr;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblImageConfirmation;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLastNameValidation;
    private javax.swing.JLabel lblLicensePlateNum;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMandatoryInstruction;
    private javax.swing.JLabel lblMedicalRecNum;
    private javax.swing.JLabel lblMiddleName;
    private javax.swing.JLabel lblMiddleNameValidation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameValidation;
    private javax.swing.JLabel lblNameValidation1;
    private javax.swing.JLabel lblSSNNum;
    private javax.swing.JLabel lblSSNNumFormat;
    private javax.swing.JLabel lblSSNNumValidation;
    private javax.swing.JLabel lblStateCode;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtBankAccountNum;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtDeviceSerialNum;
    private javax.swing.JTextField txtEmailAddr;
    private javax.swing.JTextField txtFaxNum;
    private javax.swing.JTextField txtGeographicalData;
    private javax.swing.JTextField txtHealthPlanBenNum;
    private javax.swing.JTextField txtIPAddr;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLicensePlateNum;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtMedicalRecNum;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSNNum;
    private javax.swing.JTextField txtStateCode;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
