package vcrtsv3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;

public class OwnerFrame implements ActionListener {

    static JFrame ownerView = new JFrame("Owner Sign In Form");
    static JLabel owneridLabel = new JLabel("Enter ID");
    static JTextField ownerID = new JTextField("0");
    static JLabel licenseLabel = new JLabel("License Plate");
    static JTextField licensePlate = new JTextField("0");
    static JLabel residencyLabel = new JLabel("Time");
    static JTextField residency = new JTextField("0");
    static JButton ownerButton = new JButton("Submit");
    static JLabel blank = new JLabel();
    private Date date;
    static Connection connection = null;
    static String url = "jdbc:mysql://localhost:3306/vcrts?useTimezone=true&serverTimezone=UTC";
    static String username = "root";
    static String password = "pw12345";

    OwnerFrame() {
        ownerView.setLayout(new GridLayout(4, 4));

        ownerView.add(owneridLabel);
        ownerView.add(ownerID);
        ownerView.add(licenseLabel);
        ownerView.add(licensePlate);
        ownerView.add(residencyLabel);
        ownerView.add(residency);
        ownerView.add(ownerButton);
        ownerButton.addActionListener(this);

        ownerView.add(ownerButton);
        ownerButton.addActionListener(this);

        ownerView.setSize(500, 500);
        ownerView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ownerView.setVisible(true);

    }
// Setters & Getters

    public void setId(JTextField ownerID) {
        ownerID = this.ownerID;
    }

    public void setLicensePlate(JTextField licensePlate) {
        licensePlate = this.licensePlate;
    }

    public void setResidency(JTextField residency) {
        this.residency = residency;
    }

    public int getOwnerID() {
        int oID = Integer.parseInt(ownerID.getText());
        return oID;
    }

    public String getLicensePlate() {
        String lp = licensePlate.getText();
        return lp;
    }

    public int getResidency() {
        int r = Integer.parseInt(residency.getText());
        return r;
    }

    //Clears all field 
    public void reset() {

        ownerID.setText(null);
        licensePlate.setText(null);
        residency.setText(null);
    }

    public static void hide() {
        ownerView.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        int iD = getOwnerID();
        String plate = licensePlate.getText();
        int res = getResidency();
        new VCFrame();
        /*
        try {
                connection = DriverManager.getConnection(url,username,password);
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1, iD );
                pstmt.setString(2, plate);
                pstmt.setInt(3, res);
   
                int row = pstmt.executeUpdate();              
                System.out.println("Data Successfully Added");
                System.out.println(row);
                connection.close();
        }
          catch (SQLException e) {
            e.getMessage();
        }
        reset();
         */
    }

    //CREATES NEW FILE
/*            try {
  		      File myObj = new File("owner.txt");
  		      if (myObj.createNewFile()) {
  		        System.out.println("File created: " + myObj.getName());
                        new VCFrame();
  		      } else {
  		        System.out.println("File already exists.");
  		      }
  		    } catch (IOException e) {
  		      System.out.println("An error occurred.");
  		      e.printStackTrace();
  		    }
  		
          //WRITES TO THE CREATED FILE
  		try {
  		      FileWriter myWriter = new FileWriter("owner.txt");
  		      myWriter.write("Owner ID: "+iD);
  		      myWriter.write("\nLicense Plate: "+plate);
  		      myWriter.write("\nLicense Plate: "+res);
  		      myWriter.close();
  		      System.out.println("Successfully wrote to the file.");
  		      JOptionPane.showMessageDialog(null,"Successfully wrote to the file.", null, JOptionPane.PLAIN_MESSAGE);
  		      
  		    } catch (IOException e) {
  		      System.out.println("An error occurred.");
  		      JOptionPane.showMessageDialog(null,"An error has occured!", null, JOptionPane.PLAIN_MESSAGE);
  		      e.printStackTrace();
  		    }*/
}
