import javax.swing.* ;

public class chatbotthree extends JFrame {
     static JTextArea Chatarea = new JTextArea();
     static JTextField Chatbox = new JTextField();

    
    public static void main(final String[] args){
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.setTitle("CHATBOT");
        frame.add(Chatarea);
        frame.add(Chatbox);
        //For ttext area
        Chatarea.setSize(500,400);
        Chatarea.setLocation(2,2);
        //For textfeild
        Chatbox.setSize(540,30);
        Chatbox.setLocation(2,500);

        Chatbox.addActionListener(new ActionListener());
            @Override
    ````````public void actionPerformed(ActionEvent arg0){
                String gtext = Chatbox.getText();
                Chatarea.append("You ----> "+ gtext + "\n");
                Chatbox.setText("");

                
                }
            }
        
    

        
        
    



 
       // Field.addActionListener(New ActionListener){
           
           // @Override
            /*public void actionPerformed(ActionEvent e){
                String msg = Field.getText();
                txt.append("You = " + msg + "\n");
                Field.setText("");
                if(msg.contains("hi"))*/
  
                
                
            
    
    

                
            
        

        



            
            
    
    

