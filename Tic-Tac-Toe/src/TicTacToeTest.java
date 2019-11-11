import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class TicTacToeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe tc = new TicTacToe();

}
}
class TicTacToe implements ActionListener{
	int[][] board;
	//count variable counting filled rows and using to validate if the board is full or not
	int X=1,O=-1,count;
	int current_player;
	JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,
	button16,button17,button18,button19,button20,button21,button22,button23,button24,button25;
	JLabel turn,displayWinner;
	String str="";
	boolean isWin;
	JFrame frame; 
	TicTacToe(){
		initialize_board();
		// creating instance of JFrame with name "first way" 
        frame=new JFrame("Tic-Tac-Toe"); 
         //create a JLabel to display turns
        if(current_player == 1) {
        	str = "X";
        }
        else {
        	str= "O";
        }
        turn = new JLabel(""+str+" 's turn now! Please click on button of your choice");
        displayWinner = new JLabel("");
        // creates instance of JButton 
        button1 = new JButton("-"); button15 = new JButton("-");
         button2 = new JButton("-"); button16 = new JButton("-");
         button3 = new JButton("-"); button17 = new JButton("-");
         button4 = new JButton("-"); button18 = new JButton("-");
         button5 = new JButton("-"); button19 = new JButton("-");
         button6 = new JButton("-"); button20 = new JButton("-");
         button7 = new JButton("-"); button21 = new JButton("-");
         button8 = new JButton("-"); button22 = new JButton("-");
         button9 = new JButton("-"); button23 = new JButton("-");
         button10 = new JButton("-"); button24 = new JButton("-");
         button11 = new JButton("-"); button25 = new JButton("-");
         button12 = new JButton("-");
         button13 = new JButton("-");
         button14 = new JButton("-");
         
        button1.setBounds(20, 20, 90, 50);button2.setBounds(130, 20, 90, 50);button3.setBounds(240, 20, 90, 50);button4.setBounds(350, 20, 90, 50);button5.setBounds(460, 20, 90, 50);
        button6.setBounds(20, 90, 90, 50);button7.setBounds(130, 90, 90, 50);button8.setBounds(240, 90, 90, 50);button9.setBounds(350, 90, 90, 50);button10.setBounds(460, 90, 90, 50);
        button11.setBounds(20, 160, 90, 50);button12.setBounds(130, 160, 90, 50);button13.setBounds(240, 160, 90, 50);button14.setBounds(350, 160, 90, 50);button15.setBounds(460, 160, 90, 50);
        button16.setBounds(20, 230, 90, 50);button17.setBounds(130, 230, 90, 50);button18.setBounds(240, 230, 90, 50);button19.setBounds(350, 230, 90, 50);button20.setBounds(460, 230, 90, 50);
        button21.setBounds(20, 310, 90, 50);button22.setBounds(130, 310, 90, 50);button23.setBounds(240, 310, 90, 50);button24.setBounds(350, 310, 90, 50);button25.setBounds(460, 310, 90, 50);
        turn.setBounds(130, 380, 500, 30);
        turn.setForeground(Color.RED);
        displayWinner.setBounds(130, 420, 500, 30);
        displayWinner.setForeground(Color.GREEN);
        // setting close operation 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
        // adds button in JFrame 
        frame.add(button1); frame.add(button2); frame.add(button3); frame.add(button4); frame.add(button5); 
        frame.add(button6); frame.add(button7); frame.add(button8); frame.add(button9); frame.add(button10); 
        frame.add(button11); frame.add(button12); frame.add(button13); frame.add(button14); frame.add(button15); 
        frame.add(button16); frame.add(button17); frame.add(button18); frame.add(button19); frame.add(button20); 
        frame.add(button21); frame.add(button22); frame.add(button23); frame.add(button24); frame.add(button25); 
        
        frame.add(turn);
        frame.add(displayWinner);
        // sets 500 width and 600 height 
        frame.setSize(590, 530); 
          
        // uses no layout managers 
        frame.setLayout(null); 
          
        // makes the frame visible 
        frame.setVisible(true); 
		
		button1.addActionListener(this);button2.addActionListener(this);button3.addActionListener(this);button4.addActionListener(this);button5.addActionListener(this);
		button6.addActionListener(this);button7.addActionListener(this);button8.addActionListener(this);button9.addActionListener(this);button10.addActionListener(this);
		button11.addActionListener(this);button12.addActionListener(this);button13.addActionListener(this);button14.addActionListener(this);button15.addActionListener(this);
		button16.addActionListener(this);button17.addActionListener(this);button18.addActionListener(this);button19.addActionListener(this);button20.addActionListener(this);
		button21.addActionListener(this);button22.addActionListener(this);button23.addActionListener(this);button24.addActionListener(this);button25.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(current_player == 1) {
        	str = "X";
        }
        else {
        	str= "O";
        }
		int winner=-2;
		if (evt.getSource()==button1)
        {
           //do something
			button1.setText(str);
			winner = take_in_the_move(0,0);
			
        }
    else if (evt.getSource()==button2)
        {
           //do something
    	button2.setText(str);
    	winner = take_in_the_move(0,1);
    	
        }
    else if (evt.getSource()==button3)
        {
           //do something
    	button3.setText(str);
    	winner = take_in_the_move(0,2);
        }
    else if (evt.getSource()==button4)
        {
           //do something
    	button4.setText(str);
    	winner = take_in_the_move(0,3);
        }
    else if (evt.getSource()==button5)
        {
           //do something
    	button5.setText(str);
    	winner = take_in_the_move(0,4);
        }
    else if (evt.getSource()==button6)
    {
       //do something
    	button6.setText(str);
    	winner = take_in_the_move(1,0);
    }
    else if (evt.getSource()==button7)
    {
       //do something
    	button7.setText(str);
    	winner = take_in_the_move(1,1);
    }
    else if (evt.getSource()==button8)
    {
       //do something
    	button8.setText(str);
    	winner = take_in_the_move(1,2);
    }
    else if (evt.getSource()==button9)
    {
       //do something
    	button9.setText(str);
    	winner = take_in_the_move(1,3);
    }
    else if (evt.getSource()==button10)
    {
       //do something
    	button10.setText(str);
    	winner = take_in_the_move(1,4);
    }
    else if (evt.getSource()==button11)
    {
       //do something
    	button11.setText(str);
    	winner = take_in_the_move(2,0);
    }
    else if (evt.getSource()==button12)
    {
       //do something
    	button12.setText(str);
    	winner = take_in_the_move(2,1);
    }
    else if (evt.getSource()==button13)
    {
       //do something
    	button13.setText(str);
    	winner = take_in_the_move(2,2);
    	
    }
    else if (evt.getSource()==button14)
    {
       //do something
    	button14.setText(str);
    	winner = take_in_the_move(2,3);
    }
    else if (evt.getSource()==button15)
    {
       //do something
    	button15.setText(str);
    	winner = take_in_the_move(2,4);
    }
    else if (evt.getSource()==button16)
    {button16.setText(str);
       //do something
    	winner = take_in_the_move(3,0);
    }
    else if (evt.getSource()==button17)
    {button17.setText(str);
       //do something
    	winner = take_in_the_move(3,1);
    }
    else if (evt.getSource()==button18)
    {button18.setText(str);
       //do something
    	winner = take_in_the_move(3,2);
    }
    else if (evt.getSource()==button19)
    {button19.setText(str);
       //do something
    	winner = take_in_the_move(3,3);
    }
    else if (evt.getSource()==button20)
    {button20.setText(str);
       //do something
    	winner = take_in_the_move(3,4);
    }
    else if (evt.getSource()==button21)
    {button21.setText(str);
       //do something
    	winner = take_in_the_move(4,0);
    }
    else if (evt.getSource()==button22)
    {button22.setText(str);
       //do something
    	winner = take_in_the_move(4,1);
    }
    else if (evt.getSource()==button23)
    {button23.setText(str);
       //do something
    	winner = take_in_the_move(4,2);
    }
    else if (evt.getSource()==button24)
    {button24.setText(str);
       //do something
    	winner = take_in_the_move(4,3);
    }
    else if (evt.getSource()==button25)
    {button25.setText(str);
       //do something
    	winner = take_in_the_move(4,4);
    }
		if(winner == 1) {
			displayWinner.setText("The Winner is X");
		}
		else if(winner == -1) {
			displayWinner.setText("The Winner is O");
		}
		else if(winner == -3) {
			displayWinner.setText("It's a Tie");
		}
	}
	private void initialize_board() {
		// TODO Auto-generated method stub
		board=new int[5][5];
		isWin=false;
		current_player=X;
		count=0;
		
	}
	public int take_in_the_move(int row,int col) {
		if(count==25) {
		return -3;
		}
			if(board[row][col]!=0) {
				System.out.println("Please enter the valid move");
				return -2;
			}
			
			board[row][col]=current_player;
			int winner = display_Winner(row,col,current_player);
			count+=1;
			current_player= -current_player;
			frame=new JFrame("Tic-Tac-Toe"); 
	        //create a JLabel to display turns
	       if(current_player == 1) {
	       	str = "X";
	       }
	       else {
	       	str= "O";
	       }
	       turn.setText(""+str+" 's turn now! Please click on button of your choice");
			return winner;
		
		
	}

	public int display_Winner(int row,int col,int current_player) {
		// TODO Auto-generated method stub
		if(validate_diagonal(row,col,current_player)||validate_horizontal(row,col,current_player)||validate_vertical(row,col,current_player)) {
			isWin = true;
			return current_player;
		}
		return 0;
		
	}

	private boolean validate_vertical(int row,int col,int current_player) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<5;i++)
		{
		sum = sum+board[i][col];	
		}
		return (sum==(current_player*5));
	}

	private boolean validate_horizontal(int row,int col,int current_player) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<5;i++)
		{
		sum = sum+board[row][i];	
		}
		return (sum==(current_player*5));
	}

	private boolean validate_diagonal(int row,int col,int current_player) {
		// TODO Auto-generated method stub
		int sum=0;
		if(row==col) {
			for(int i=0;i<5;i++)
			{
			sum = sum+board[i][i];	
			}
		}
		
		return (sum==(current_player*5));
	}
}