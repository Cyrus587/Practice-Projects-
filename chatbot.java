heimport javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color; //color for background
 
import java.awt.event.KeyListener;  //when you press enter same thing is action listening moniter keys typed 
import java.awt.event.KeyEvent;  // input stuff

import java.lang.Math;

public class ChatBot extends JFrame implements KeyListener{

	JPanel p=new JPanel(); //making a panel 
	JTextArea dialog=new JTextArea(20,50); // dialog whole conversation non editable 
	JTextArea input=new JTextArea(1,50); // put your own thing in is editable 
	JScrollPane scroll=new JScrollPane(  //select how you want to scroll
		dialog,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
	);
	
	String[][] chatBot={   //all the stuff I can say and what the bot will react to the 				way it is set up each index of the array is another array 

		//standard greetings
		{"hi","hello","hola","ola","howdy"},  //things that I will say // first two line group 0
		{"hi","hello","hey"},
		//question greetings
		{"how are you","how r you","how r u","how are u"},
		{"good","doing well"},
		//yes
		{"yes"},
		{"no","NO","NO!!!!!!!"},
		//default
		{"shut up","you're bad","noob","stop talking",
		"(michael is unavailable, due to LOL)"}
	};
	
	public static void main(String[] args){
		new ChatBot(); //constructer method for the class
	}
	
	public ChatBot(){
		super("Chat Bot"); // title
		setSize(600,400);  //size of 
		setResizable(false);  //cant resize
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		dialog.setEditable(false);  //make visible default true input still true
		input.addKeyListener(this);  //add keylistner is this class not any other class "this"
	 
		p.add(scroll); //adding these components to the window 
		p.add(input);  //adding it to JFrame 
		p.setBackground(new Color(255,200,0));
		add(p);
		
		setVisible(true);
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_ENTER){ //check if the key you pressed was enter 
			input.setEditable(false);
			//-----grab quote-----------
			String quote=input.getText();//grab what ever text you have in the input 
			input.setText("");  //clear the text in the input to type more stuff
			addText("-->You:\t"+quote); //add what we said to the conversation before the bot responds again
			quote.trim(); //take away all the white space 
			while(
				quote.charAt(quote.length()-1)=='!' ||  //while punction take away punctuation
				quote.charAt(quote.length()-1)=='.' ||
				quote.charAt(quote.length()-1)=='?'
			){
				quote=quote.substring(0,quote.length()-1); //substring method with arguments, 0 and the quote length and its minus one because we are taking away the punctuation
			}
			quote.trim();
			byte response=0;
			/*
			0:we're searching through chatBot[][] for matches
			1:we didn't find anything
			2:we did find something
			*/
			//-----check for matches----
			int j=0;//which group we're checking
			while(response==0){  //searching 
				if(inArray(quote.toLowerCase(),chatBot[j*2])){ // check a word for a particular array  
					response=2;
					int r=(int)Math.floor(Math.random()*chatBot[(j*2)+1].length); //gives random number between 0 and 1 we will multiply this by the number of possibilities we have whitch is the array of michales responses multiply random number by number of possibilities 
					addText("\n-->Michael\t"+chatBot[(j*2)+1][r]);  //[r] is the index in the array that we are grabbing 
				}
				j++; //continue iterating 
				if(j*2==chatBot.length-1 && response==0){  //check to see if we havent reached our limit for the group
					response=1;  //didnt find anything 
				}
			}
			
			//-----default--------------
			if(response==1){
				int r=(int)Math.floor(Math.random()*chatBot[chatBot.length-1].length); //random number between 0 and 1 multiple by the number of responses + 1 and we want to get the total length round down to the nearest interger
				addText("\n-->Michael\t"+chatBot[chatBot.length-1][r]);//grabing a random array from list 
			}
			addText("\n");
		}
	}
	
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_ENTER){  //what to make the input editable agian 
			input.setEditable(true);
		}
	}
	
	public void keyTyped(KeyEvent e){}
	
	public void addText(String str){
		dialog.setText(dialog.getText()+str);//adding text to the dialog grab what it has and add the text str 
	}
	
	public boolean inArray(String in,String[] str){//return true if it does find the string in the array return false other wise 
		boolean match=false;  
		for(int i=0;i<str.length;i++){  //loops through the entire array 
			if(str[i].equals(in)){//if element matches with anything 
                match = true;
				match=true;  //now either match would have been true or match would have been false 
			}
		}
		return match;
	}
}