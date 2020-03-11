import javax.swing.*;
public class Main{
    public static void main (String[] args)  {
        JFrame jf = new JFrame();
        final JTextField varNama = new JTextField(30);
        
        JLabel name = new JLabel("Nama : ");
        JLabel gender = new JLabel("Jenis Kelamin : ");
        JRadioButton rbMale = new JRadioButton("Laki-laki");
        JRadioButton rbFemale = new JRadioButton("Perempuan");
        JLabel agama = new JLabel("Agama : ");
        String namaAgama[]= {"Islam","Kristen","Katolik","Hindu","Budha"};
        JComboBox<String> cmbAgama = new JComboBox<>(namaAgama);
        JLabel check = new JLabel("Data diatas adalah benar ");
        JCheckBox chbCheck = new JCheckBox();
        JButton submit = new JButton("Submit");

        ButtonGroup group = new ButtonGroup();
        group.add(rbMale);
        group.add(rbFemale);

        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);
        jf.add(varNama);
        jf.add(name);
        jf.add(gender);
        jf.add(rbMale);
        jf.add(rbFemale);
        jf.add(agama);
        jf.add(cmbAgama);
        jf.add(check);
        jf.add(chbCheck);
        jf.add(submit);

        name.setBounds(10,10,120,20);
        varNama.setBounds(220,10,150,20);
        gender.setBounds(10,35,120,20);
        rbMale.setBounds(220,35,100,20);
        rbFemale.setBounds(320,35,100,20);
        agama.setBounds(10,60,150,20);
        cmbAgama.setBounds(220,60,150,20);
        check.setBounds(10,85,200,20);
        chbCheck.setBounds(220,85,150,20);
        submit.setBounds(200,130,120,20);

        jf.setVisible(true);
    }
}