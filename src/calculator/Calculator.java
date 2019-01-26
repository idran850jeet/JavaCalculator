package calculator;

import  java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener {
    Frame frame;
    Dimension minSize;

    Label labResult,labInput;

    Button btnAdd,btnSub,btnMul,btnDiv,btnModul,btnEqual,btnSign,btnBack,btnDel,btnOne
            ,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnDecimal;
    String inStr="",resStr="",operator="";
    Double value=0.0,temValue=0.0;
    byte flag=1;


  public Calculator(){
      initialiseCalculator();
  }

  //method for component set of calculator
private void initialiseCalculator(){
     frame=new Frame();
     minSize=new Dimension(338,420);

     labResult=new Label();
     labInput=new Label();

     btnAdd=new Button("+");
     btnSub=new Button("-");
     btnMul=new Button("*");
     btnDiv=new Button("/");
     btnModul=new Button("%");
     btnEqual=new Button("=");
     btnSign=new Button("+|-");
     btnBack=new Button("C");
     btnDel=new Button("Del");
     btnOne=new Button("1");
     btnTwo=new Button("2");
     btnThree=new Button("3");
     btnFour=new Button("4");
     btnFive=new Button("5");
     btnSix=new Button("6");
     btnSeven=new Button("7");
     btnEight=new Button("8");
     btnNine=new Button("9");
     btnZero=new Button("0");
     btnDecimal=new Button(".");

    labResult.setText("Result");
    labResult.setBounds(50,40,215,25);
    labResult.setBackground(new Color(211,211,211));
    labResult.setAlignment(Label.RIGHT);
    labInput.setFont(new Font("Monospaced",Font.BOLD , 14));
    labInput.setText("input Value");
    labInput.setBounds(50,70,215,25);
    labInput.setAlignment(Label.RIGHT);
    labInput.setBackground(new Color(211,211,211));
    labInput.setFont(new Font("Monospaced",Font.BOLD , 20));

    btnDel.setBounds(50,100,50,50);
    btnBack.setBounds(105,100,50,50);
    btnModul.setBounds(160,100,50,50);
    btnDiv.setBounds(215,100,50,50);

    btnSeven.setBounds(50,155,50,50);
    btnEight.setBounds(105,155,50,50);
    btnNine.setBounds(160,155,50,50);
    btnMul.setBounds(215,155,50,50);

    btnFour.setBounds(50,210,50,50);
    btnFive.setBounds(105,210,50,50);
    btnSix.setBounds(160,210,50,50);
    btnSub.setBounds(215,210,50,50);

    btnOne.setBounds(50,265,50,50);
    btnTwo.setBounds(105,265,50,50);
    btnThree.setBounds(160,265,50,50);
    btnAdd.setBounds(215,265,50,50);

    btnSign.setBounds(50,320,50,50);
    btnZero.setBounds(105,320,50,50);
    btnDecimal.setBounds(160,320,50,50);
    btnEqual.setBounds(215,320,50,50);

    //Adding Components to frame
    frame.add(labResult);
    frame.add(labInput);

    frame.add(btnDel);
    frame.add(btnBack);
    frame.add(btnModul);
    frame.add(btnDiv);

    frame.add(btnSeven);
    frame.add(btnEight);
    frame.add(btnNine);
    frame.add(btnMul);

    frame.add(btnFour);
    frame.add(btnFive);
    frame.add(btnSix);
    frame.add(btnSub);

    frame.add(btnOne);
    frame.add(btnTwo);
    frame.add(btnThree);
    frame.add(btnAdd);

    frame.add(btnSign);
    frame.add(btnZero);
    frame.add(btnDecimal);
    frame.add(btnEqual);

    frame.setLayout(null);
    frame.setVisible(true);
    frame.setMinimumSize(minSize);
    frame.setSize(minSize);
    frame.setMaximumSize(minSize);
    frame.setTitle("Calculator");
    frame.setLocation(500,100);
    frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(-1);
        }
    });

    //Adding action listener
    btnAdd.addActionListener(this::actionPerformed);
    btnSub.addActionListener(this::actionPerformed);
    btnMul.addActionListener(this::actionPerformed);
    btnDiv.addActionListener(this::actionPerformed);
    btnModul.addActionListener(this::actionPerformed);
    btnEqual.addActionListener(this::actionPerformed);
    btnSign.addActionListener(this::actionPerformed);
    btnBack.addActionListener(this::actionPerformed);
    btnDel.addActionListener(this::actionPerformed);
    btnOne.addActionListener(this::actionPerformed);
    btnTwo.addActionListener(this::actionPerformed);
    btnThree.addActionListener(this::actionPerformed);
    btnFour.addActionListener(this::actionPerformed);
    btnFive.addActionListener(this::actionPerformed);
    btnSix.addActionListener(this::actionPerformed);
    btnSeven.addActionListener(this::actionPerformed);
    btnEight.addActionListener(this::actionPerformed);
    btnNine.addActionListener(this::actionPerformed);
    btnZero.addActionListener(this::actionPerformed);
    btnDecimal.addActionListener(this::actionPerformed);

}


    public static void main(String[] arg){
        Calculator calculator=new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

       System.out.println(e.getActionCommand());

      switch (e.getActionCommand()){
          case "0" : inStr+="0";
                     System.out.println(inStr);
                     labInput.setText(inStr);
              break;
          case "1" :  inStr+="1";
                      System.out.println(inStr);
                      labInput.setText(inStr);
              break;
          case "2" :  inStr+="2";
                      System.out.println(inStr);
                      labInput.setText(inStr);
              break;
          case "3" :  inStr+="3";
                      labInput.setText(inStr);
              break;
          case "4" :  inStr+="4";
              labInput.setText(inStr);
              break;
          case "5" : inStr+="5";
              labInput.setText(inStr);
              break;
          case "6" : inStr+="6";
              labInput.setText(inStr);
              break;
          case "7" : inStr+="7";
              labInput.setText(inStr);
              break;
          case "8" : inStr+="8";
              labInput.setText(inStr);
              break;
          case "9" : inStr+="9";
              labInput.setText(inStr);
              break;
          case "." : inStr+=".";
              labInput.setText(inStr);
              break;
          case "+" : if(inStr.length()!=0) {
                     operator = "+";
                     value += Double.parseDouble(inStr);
                     resStr += inStr + operator;
                     inStr = "";
                     labInput.setText(inStr);
                     labResult.setText(resStr);
              }else if(inStr.length()==0&&(temValue!=0.0))
                 {
                     operator = "+";
                     value=temValue;
                     resStr +=value.toString()+ operator;
                     inStr = "";
                     labInput.setText(inStr);
                     labResult.setText(resStr);
                     temValue=0.0;
                 }

              break;
          case "-" :
              if(inStr.length()!=0) {
                  operator = "-";
                  if(value==0.0)
                  value = Double.parseDouble(inStr);
                  else
                   value-=Double.parseDouble(inStr);
                  resStr += inStr + operator;
                  inStr = "";
                  labInput.setText(inStr);
                  labResult.setText(resStr);
              }else if(inStr.length()==0&&(temValue!=0.0))
              {
                  operator = "-";
                  value=temValue;
                  resStr +=value.toString()+ operator;
                  inStr = "";
                  labInput.setText(inStr);
                  labResult.setText(resStr);
                  temValue=0.0;
              }
              break;
          case "*" :
              if(inStr.length()!=0) {
                  operator = "*";
                  if(value==0.0)
                  value= Double.parseDouble(inStr);
                  else value*= Double.parseDouble(inStr);
                  resStr += inStr + operator;
                  inStr = "";
                  labInput.setText(inStr);
                  labResult.setText(resStr);
              }else if(inStr.length()==0&&(temValue!=0.0))
              {
                  operator = "*";
                  value=temValue;
                  resStr +=value.toString()+ operator;
                  inStr = "";
                  labInput.setText(inStr);
                  labResult.setText(resStr);
                  temValue=0.0;
              }
              break;
          case "/" :
              if(inStr.length()!=0) {
                  operator = "/";
                  if(value==0.0)
                      value=Double.parseDouble(inStr);
                  else {
                      if (Double.parseDouble(inStr) == 0.0){
                          labResult.setText("Can't divied by zero");
                          inStr="";
                          resStr="";
                          value=0.0;
                          temValue=0.0;
                          labInput.setText(inStr);
                          break;}
                      else value /= Double.parseDouble(inStr);
                  }
                  resStr += inStr + operator;
                  inStr = "";
                  labInput.setText(inStr);
                  labResult.setText(resStr);
              }else if(inStr.length()==0&&(temValue!=0.0))
              {
                  operator = "/";
                  value=temValue;
                  resStr +=value.toString()+ operator;
                  inStr = "";
                  labInput.setText(inStr);
                  labResult.setText(resStr);
                  temValue=0.0;
              }
              break;
          case "%" :
              if(inStr.length()!=0) {
                  operator = "%";
                  if(value==0.0)
                      value= Double.parseDouble(inStr);
                  else value%= Double.parseDouble(inStr);
                  resStr += inStr + operator;
                  inStr = "";
                  labInput.setText(inStr);
                  labResult.setText(resStr);
              }else if(inStr.length()==0&&(temValue!=0.0))
              {
                  operator = "*";
                  value=temValue;
                  resStr +=value.toString()+ operator;
                  inStr = "";
                  labInput.setText(inStr);
                  labResult.setText(resStr);
                  temValue=0.0;
              }
              break;
          case "C" :
              inStr="";
              resStr="";
              value=0.0;
              temValue=0.0;
              labResult.setText(resStr);
              labInput.setText(inStr);
              break;
          case "Del" : if((inStr.length())>0){
                   inStr = inStr.substring(0, inStr.length() - 1);
                   labInput.setText(inStr);
                 }
              break;
          case "+|-": if((inStr.length())>0){
              if(flag==0){
              inStr = "-"+inStr;
              flag=1;
              }
              else {
                  String tem=inStr.substring(0,1);
                  if(tem.compareTo("-")==0)
                  inStr=inStr.substring(1,inStr.length());
                  flag = 0;
              }
              labInput.setText(inStr);
          }
              break;
          case "=" : if(inStr.length()!=0){
              if(operator=="+")
                  value+=Double.parseDouble(inStr);
              else if (operator=="-")
                  value-=Double.parseDouble(inStr);
              else if (operator=="*")
                  value*=Double.parseDouble(inStr);
              else if (operator=="%")
                  value%=Double.parseDouble(inStr);
              else if (operator=="/")
              {   labResult.setText(inStr);
                  if(Double.parseDouble(inStr)==0)
                  { labResult.setText("Can't divided by zero");
                      inStr="";
                      resStr="";
                      value=0.0;
                      temValue=0.0;
                     labInput.setText(inStr);
                      break;
                  }
                  else
                      value=(value/Double.parseDouble(inStr));
              }

              labInput.setText(value.toString());
              inStr="";
              temValue=value;
              value=0.0;
              resStr="";
              labResult.setText(resStr);
          }
              break;
      }

    }
}
