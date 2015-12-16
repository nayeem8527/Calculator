import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator {
	private JFrame mainFrame;
	private int od=0;             //one time decimal should come
	private int eq=0;
	
	public calculator()
	{
		prepareGUI();
	}
	
	public static void main(String [] args)
	{
		calculator  showField = new calculator();
		showField.showField();
	}
	
	private void prepareGUI()
	{
		mainFrame = new JFrame("Calculator");
	    mainFrame.setSize(200,200);
	    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    mainFrame.setVisible(true);
	}
	
	private void showField()
	{
		mainFrame.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JTextField number = new JTextField(100);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridwidth = 4;
		c.gridx = 0;
		c.gridy = 0;
		mainFrame.add(number, c);
		
		JButton seven = new JButton("7");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 0;       
		c.gridwidth = 1;   
		c.gridy = 1;       
		mainFrame.add(seven, c);		
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
					if(eq==1)
					{
						number.setText("");
						eq=0;
					}
					number.setText(number.getText() + "7");
			}
		});
		
		JButton eight = new JButton("8");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 1;       
		c.gridwidth = 1;   
		c.gridy = 1;       
		mainFrame.add(eight, c);
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(eq==1)
				{
					number.setText("");
					eq=0;
				}
				number.setText(number.getText() + "8");
			}
		});
		
		JButton nine = new JButton("9");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 2;       
		c.gridwidth = 1;   
		c.gridy = 1;       
		mainFrame.add(nine, c);
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(eq==1)
				{
					number.setText("");
					eq=0;
				}
				number.setText(number.getText() + "9");
			}
		});
		
		JButton plus = new JButton("+");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 3;       
		c.gridwidth = 1;   
		c.gridy = 1;       
		mainFrame.add(plus, c);
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				number.setText(number.getText() + "+");
				od=0;
			}
		});
		
		JButton four = new JButton("4");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 0;       
		c.gridwidth = 1;   
		c.gridy = 2;       
		mainFrame.add(four, c);
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(eq==1)
				{
					number.setText("");
					eq=0;
				}
				number.setText(number.getText() + "4");
			}
		});
		
		JButton five = new JButton("5");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 1;       
		c.gridwidth = 1;   
		c.gridy = 2;       
		mainFrame.add(five, c);
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(eq==1)
				{
					number.setText("");
					eq=0;
				}
				number.setText(number.getText() + "5");
			}
		});
		
		JButton six = new JButton("6");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 2;       
		c.gridwidth = 1;   
		c.gridy = 2;       
		mainFrame.add(six, c);
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(eq==1)
				{
					number.setText("");
					eq=0;
				}
				number.setText(number.getText() + "6");
			}
		});
		
		JButton minus = new JButton("-");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 3;       
		c.gridwidth = 1;   
		c.gridy = 2;       
		mainFrame.add(minus, c);
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				number.setText(number.getText() + "-");
				od=0;
			}
		});
		
		JButton one = new JButton("1");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 0;       
		c.gridwidth = 1;   
		c.gridy = 3;       
		mainFrame.add(one, c);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(eq==1)
				{
					number.setText("");
					eq=0;
				}
				number.setText(number.getText() + "1");
			}
		});
		
		JButton two = new JButton("2");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 1;       
		c.gridwidth = 1;   
		c.gridy = 3;       
		mainFrame.add(two, c);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(eq==1)
				{
					number.setText("");
					eq=0;
				}
				number.setText(number.getText() + "2");
			}
		});
		
		JButton three = new JButton("3");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 2;       
		c.gridwidth = 1;   
		c.gridy = 3;       
		mainFrame.add(three, c);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(eq==1)
				{
					number.setText("");
					eq=0;
				}
				number.setText(number.getText() + "3");
			}
		});
		
		JButton multiply = new JButton("*");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 3;       
		c.gridwidth = 1;   
		c.gridy = 3;       
		mainFrame.add(multiply, c);
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				number.setText(number.getText() + "*");
				od=0;
			}
		});
		
		JButton zero = new JButton("0");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 0;       
		c.gridwidth = 1;   
		c.gridy = 4;       
		mainFrame.add(zero, c);
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(eq==1)
				{
					number.setText("");
					eq=0;
				}
				number.setText(number.getText() + "0");
			}
		});
		
		JButton decimal = new JButton(".");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 1;       
		c.gridwidth = 1;   
		c.gridy = 4;       
		mainFrame.add(decimal, c);
		decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(eq==1)
				{
					number.setText("");
					eq=0;
				}
				if(od==0)
				{
					number.setText(number.getText() + ".");
					od = od+1;
				}
				
			}
		});
		
		JButton divide = new JButton("/");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 2;       
		c.gridwidth = 1;   
		c.gridy = 4;       
		mainFrame.add(divide, c);
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				number.setText(number.getText() + "/");
				od=0;
			}
		});
		
		JButton equal = new JButton("=");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END; 
		c.gridx = 3;       
		c.gridwidth = 1;   
		c.gridy = 4;       
		mainFrame.add(equal, c);
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				eq++;
				int before=0,after=0;
				StringBuilder name = new StringBuilder(number.getText());
				StringBuilder name1 = new StringBuilder();
				StringBuilder name2 = new StringBuilder();
				int q = name.length();
				int p,p1;
				for(int i=0;i<q;i++)
				{
					if(name.charAt(i)=='/')
					{
						for(int j=i-1;j>=0;j--)
						{
							if(name.charAt(j)=='+' || name.charAt(j)=='/' || name.charAt(j)=='*' || name.charAt(j)=='-')
							{
								break;
							}
							name1.append(name.charAt(j));
							before++;
						}
						p = i-before;
						name1.reverse();
						for(int k=i+1;k<q;k++)
						{
							if(name.charAt(k)=='+' || name.charAt(k)=='/' || name.charAt(k)=='*' || name.charAt(k)=='-')
							{
								break;
							}
							name2.append(name.charAt(k));
							after++;
						}
						p1=after+i;
						String a1 = String.valueOf(name1);
						String b1 = String.valueOf(name2);
						Double a = Double.valueOf(a1);
						Double b = Double.valueOf(b1);
						a=a/b;
						String z1 = String.valueOf(a);
						int small = z1.length();
						int tyu=0;
						char wer = '\0';
						for(int g=p;g<=p1;g++)
						{
							if(tyu<small)
							{
								char z = z1.charAt(tyu);
								name.setCharAt(g,z);
								tyu++;
							}
							else
							{
								name.setCharAt(g,wer);
							}
						}
						q = name.length();
						after=before=0;
						name1.setLength(0);
						name2.setLength(0);
					}	
				}
				for(int i=0;i<q;i++)
				{
					if(name.charAt(i)=='*')
					{
						for(int j=i-1;j>=0;j--)
						{
							if(name.charAt(j)=='+' || name.charAt(j)=='/' || name.charAt(j)=='*' || name.charAt(j)=='-')
							{
								break;
							}
							name1.append(name.charAt(j));
							before++;
						}
						p = i-before;
						name1.reverse();
						for(int k=i+1;k<q;k++)
						{
							if(name.charAt(k)=='+' || name.charAt(k)=='/' || name.charAt(k)=='*' || name.charAt(k)=='-')
							{
								break;
							}
							name2.append(name.charAt(k));
							after++;
						}
						p1=after+i;
						String a1 = String.valueOf(name1);
						String b1 = String.valueOf(name2);
						Double a = Double.valueOf(a1);
						Double b = Double.valueOf(b1);
						a=a*b;
						String z1 = String.valueOf(a);
						int small = z1.length();
						int tyu=0;
						char wer = '\0';
						for(int g=p;g<=p1;g++)
						{
							if(tyu<small)
							{
								char z = z1.charAt(tyu);
								name.setCharAt(g,z);
								tyu++;
							}
							else
							{
								name.setCharAt(g,wer);
							}
						}
						q = name.length();
						after=before=0;
						name1.setLength(0);
						name2.setLength(0);
					}	
				}
				for(int i=0;i<q;i++)
				{
					if(name.charAt(i)=='+')
					{
						for(int j=i-1;j>=0;j--)
						{
							if(name.charAt(j)=='+' || name.charAt(j)=='/' || name.charAt(j)=='*' || name.charAt(j)=='-')
							{
								break;
							}
							name1.append(name.charAt(j));
							before++;
						}
						p = i-before;
						name1.reverse();
						for(int k=i+1;k<q;k++)
						{
							if(name.charAt(k)=='+' || name.charAt(k)=='/' || name.charAt(k)=='*' || name.charAt(k)=='-')
							{
								break;
							}
							name2.append(name.charAt(k));
							after++;
						}
						p1=after+i;
						String a1 = String.valueOf(name1);
						String b1 = String.valueOf(name2);
						Double a = Double.valueOf(a1);
						Double b = Double.valueOf(b1);
						a=a+b;
						String z1 = String.valueOf(a);
						int small = z1.length();
						int tyu=0;
						char wer = '\0';
						for(int g=p;g<=p1;g++)
						{
							if(tyu<small)
							{
								char z = z1.charAt(tyu);
								name.setCharAt(g,z);
								tyu++;
							}
							else
							{
								name.setCharAt(g,wer);
							}
						}
						q = name.length();
						after=before=0;
						name1.setLength(0);
						name2.setLength(0);
					}	
				}
				for(int i=0;i<q;i++)
				{
					if(name.charAt(i)=='-')
					{
						for(int j=i-1;j>=0;j--)
						{
							if(name.charAt(j)=='+' || name.charAt(j)=='/' || name.charAt(j)=='*' || name.charAt(j)=='-')
							{
								break;
							}
							name1.append(name.charAt(j));
							before++;
						}
						p = i-before;
						name1.reverse();
						for(int k=i+1;k<q;k++)
						{
							if(name.charAt(k)=='+' || name.charAt(k)=='/' || name.charAt(k)=='*' || name.charAt(k)=='-')
							{
								break;
							}
							name2.append(name.charAt(k));
							after++;
						}
						p1=after+i;
						String a1 = String.valueOf(name1);
						String b1 = String.valueOf(name2);
						Double a = Double.valueOf(a1);
						Double b = Double.valueOf(b1);
						a=a-b;
						String z1 = String.valueOf(a);
						int small = z1.length();
						int tyu=0;
						char wer = '\0';
						for(int g=p;g<=p1;g++)
						{
							if(tyu<small)
							{
								char z = z1.charAt(tyu);
								name.setCharAt(g,z);
								tyu++;
							}
							else
							{
								name.setCharAt(g,wer);
							}
						}
						q = name.length();
						after=before=0;
						name1.setLength(0);
						name2.setLength(0);
					}	
				}
				String answer = String.valueOf(name);
				number.setText(answer);				
			}
		});
		mainFrame.setVisible(true);	
	}
}