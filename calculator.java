import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
class Window  implements ActionListener{
    JLabel lb;
    JButton b7, b8, b9, b0, b1, b2, b3, b4, b5, b6, bM, bD, bS, bA, bE, bDot, bC;
    String operator = "+";
    float first = 0;
    Window(){
        JFrame f = new JFrame("Calculator");
        lb = new JLabel(" ", SwingConstants.RIGHT);

        bC = new JButton("C");

        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bD = new JButton("/");

        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        bM = new JButton("X");

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        bS = new JButton("-");

        b0 = new JButton("0");
        bDot = new JButton(".");
        bE = new JButton("=");
        bA = new JButton("+");

        lb.setBounds(0, 0, 380, 100);
        lb.setFont(new Font("Verdana", Font.PLAIN, 26));
        Font font = new Font("Verdana", Font.PLAIN, 22);
        b7.setFont(font);
        b8.setFont(font);
        b9.setFont(font);
        bD.setFont(font);
        b4.setFont(font);
        b5.setFont(font);
        b6.setFont(font);
        bM.setFont(font);
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        bS.setFont(font);
        b0.setFont(font);
        bDot.setFont(font);
        bE.setFont(font);
        bA.setFont(font);
        bC.setFont(font);

        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bD.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        bM.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        bS.addActionListener(this);
        b0.addActionListener(this);
        bDot.addActionListener(this);
        bE.addActionListener(this);
        bA.addActionListener(this);
        bC.addActionListener(this);
        
        bC.setBounds(300, 100, 100, 100);
        b7.setBounds(0, 200, 100, 100);
        b8.setBounds(100, 200, 100, 100);
        b9.setBounds(200, 200, 100, 100);
        bD.setBounds(300, 200, 100, 100);

        b4.setBounds(0, 300, 100, 100);
        b5.setBounds(100, 300, 100, 100);
        b6.setBounds(200, 300, 100, 100);
        bM.setBounds(300, 300, 100, 100);

        b1.setBounds(0, 400, 100, 100);
        b2.setBounds(100, 400, 100, 100);
        b3.setBounds(200, 400, 100, 100);
        bS.setBounds(300, 400, 100, 100);

        b0.setBounds(0, 500, 100, 100);
        bDot.setBounds(100, 500, 100, 100);
        bE.setBounds(200, 500, 100, 100);
        bA.setBounds(300, 500, 100, 100);
        
        f.add(lb);

        f.add(bC);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bD);

        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bM);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bS);

        f.add(b0);
        f.add(bDot);
        f.add(bE);
        f.add(bA);

        f.setSize(400, 630);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        String text, result="0";
        float second=0;
        if(e.getSource() == b7){
            text = lb.getText();
            lb.setText(text + "7");
        }else if(e.getSource() == b8){
            text = lb.getText();
            lb.setText(text + "8");
        }else if(e.getSource() == b9){
            text = lb.getText();
            lb.setText(text + "9");
        }else if(e.getSource() == b6){
            text = lb.getText();
            lb.setText(text + "6");
        }else if(e.getSource() == b5){
            text = lb.getText();
            lb.setText(text + "5");
        }else if(e.getSource() == b4){
            text = lb.getText();
            lb.setText(text + "4");
        }else if(e.getSource() == b3){
            text = lb.getText();
            lb.setText(text + "3");
        }else if(e.getSource() == b2){
            text = lb.getText();
            lb.setText(text + "2");
        }else if(e.getSource() == b1){
            text = lb.getText();
            lb.setText(text + "1");
        }else if(e.getSource() == b0){
            text = lb.getText();
            lb.setText(text + "0");
        }else if(e.getSource() == bDot){
            text = lb.getText();
            lb.setText(text + ".");
        }
        else if(e.getSource() == bA){
            first = Float.parseFloat(lb.getText());
            operator = "+";
            lb.setText("");
        }
        else if(e.getSource() == bS){
            first = Float.parseFloat(lb.getText());
            operator = "-";
            lb.setText("");
        }
        else if(e.getSource() == bM){
            first = Float.parseFloat(lb.getText());
            operator = "*";
            lb.setText("");
        }
        else if(e.getSource() == bD){
            first = Float.parseFloat(lb.getText());
            operator = "/";
            lb.setText("");
        }else if(e.getSource() == bE){
            second = Float.parseFloat(lb.getText());
            if(operator == "+"){
                result = Float.toString(first + second);
            }else if(operator == "-"){
                result = Float.toString(first - second);
            }else if(operator == "*"){
                result = Float.toString(first * second);
            }else if(operator == "/"){
                result = Float.toString(first / second);
            }
            lb.setText(result);
        }else if(e.getSource() == bC){
            lb.setText("");
        }
    }
}
public class calculator{
    public static void main(String args[]){
        Window obj = new Window();
    }
}