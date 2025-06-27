import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CypherText extends JFrame implements ActionListener {
    JLabel inputlabel, decriptlabel, plaintextlabel, changelabel;
    JTextField inputtf, lenthtf;
    JTextArea plainarea, changearea,decriptarea;
    JButton convert;
    JMenuBar menuBar;
    JMenuItem encripted,decripted;
    JMenu option;




    CypherText() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(100, 100, 600, 500);
        this.setLayout(null);
        this.setTitle("Plain text to cypher text");
        this.getContentPane().setBackground(Color.PINK);


        option=new JMenu("Option");
        encripted=new JMenuItem("Encripted");
        decripted=new JMenuItem("Decripted");

        menuBar = new JMenuBar();








        option.add(encripted);
        option.add(decripted);
        menuBar.add(option);
        this.setJMenuBar(menuBar);


        encripted.addActionListener(this);
        decripted.addActionListener(this);




        inputlabel = new JLabel("Cypher text range         :");
        inputlabel.setBounds(10, 20, 200, 40);
        this.add(inputlabel);

     /*   lenthlabel = new JLabel("Series of convert number        :");
        lenthlabel.setBounds(10, 60, 200, 40);
        this.add(lenthlabel);
*/
        plaintextlabel = new JLabel("Plain text                  :");
        plaintextlabel.setBounds(10, 80, 200, 40);
        this.add(plaintextlabel);

/*        convert=new JButton("Clear");
        convert.setBounds(450,20,100,50);
        this.add(convert);
        convert.addActionListener(this);
*/

        changelabel = new JLabel("Encripted text       :");
        changelabel.setBounds(10, 200, 200, 40);
        this.add(changelabel);

        decriptlabel=new JLabel("Decripted text");
        decriptlabel.setBounds(10,320,200,40);
        this.add(decriptlabel);


        inputtf = new JTextField();
        inputtf.setBounds(210, 20, 200, 40);
        this.add(inputtf);


     /*  lenthtf = new JTextField();
        lenthtf.setBounds(210, 60, 200, 40);
        this.add(lenthtf);
*/
        plainarea = new JTextArea();
        plainarea.setBounds(210, 80, 200, 100);
        this.add(plainarea);


        changearea = new JTextArea();
        changearea.setBounds(210, 200, 200, 100);
        this.add(changearea);

        decriptarea=new JTextArea();
        decriptarea.setBounds(210,330,200,100);
        this.add(decriptarea);

        this.setVisible(true);

    }




    public static void main(String[] args) {
        CypherText frame = new CypherText();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
      /*  {
            inputtf.setText("");
        }
*/


        if (source == encripted) {

            String str = plainarea.getText();
            String ss = "";
            int len = str.length();

            for (int i = 0; i < len; i++)
            {
                int n= (int) (str.charAt(i) + Integer.parseInt(inputtf.getText()));

                char c = (char) n;


                ss = ss + c;
                changearea.setText(ss);
            }

        }

        if(source==decripted){


            String str = changearea.getText();
            String ss = "";
            int len = str.length();

            for (int i = 0; i < len; i++)
            {
                int n= (int) (str.charAt(i) - Integer.parseInt(inputtf.getText()));

                char c = (char) n;


                ss = ss + c;
                decriptarea.setText(ss);
            }




        }



    }


}
