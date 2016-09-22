package game2DArray;
import java.util.Scanner;
import java.awt.Color;

public class game
	{
		static String [][]map;
		static boolean win=false;
		static boolean lose=false;
		static boolean hell=false;
		public static void main(String args[]) throws InterruptedException
			{
				initializeMap();
				Thread.sleep(2500);
				if(hell)
					{
						System.out.println("In 'Survive' mode, your opponent goes first with more intelligence and more turns.");
						for(int i=1;i<=5;i++)
							{
								System.out.println("Turn: "+i);
								Thread.sleep(1000);
								if(win==false&&lose==false)
									{
										aiWiseTurn();
									}
								else
									{
										break;
									}
								if(win==false&&lose==false)
									{
										playerTurn();
									}
								else
									{
										break;
									}
							}
					}
				else
					{
						for(int i=1;i<=5;i++)
							{
								System.out.println("Turn: "+i);
								Thread.sleep(1000);
								if(win==false&&lose==false)
									{
										playerTurn();
									}
								else
									{
										break;
									}
								if(win==false&&lose==false)
									{
										aiTurn();
									}
								else
									{
										break;
									}
							}
					}
				if(win)
					{
						System.out.println("Nice, you won!!! :D");
					}
				else if(lose)
					{
						System.out.println("Sorry, you lose. D:");
					}
				else
					{
						System.out.println("Oops, a draw. :/");
					}
			}
		public static void checkPlayer()
			{
				int x=map.length;
				int y=map[0].length;
				int area=x*y;
				int number=0;
				for(int i=0;i<x;i++)
					{
						for(int j=0;j<y;j++)
							{
								if(map[i][j].equals("A"))
									{
										number++;
									}
							}
					}
				if(number==0)
					{
						lose=true;
					}
			}
		public static void checkAI()
			{
				int x=map.length;
				int y=map[0].length;
				int area=x*y;
				int number=0;
				for(int i=0;i<x;i++)
					{
						for(int j=0;j<y;j++)
							{
								if(map[i][j].equals("a"))
									{
										number++;
									}
							}
					}
				if(number==0)
					{
						win=true;
					}
			}
		public static void initializeMap() throws InterruptedException
			{
				Scanner scan= new Scanner(System.in);
				System.out.println("Welcome to Heart of Iron V! XD");
				Thread.sleep(1000);
				System.out.println("In this game, there are only 5 turns. If no one wins after that, it's a draw.");
				Thread.sleep(2000);
				System.out.println("Now, to start, you need to create the size of the map you want. Type out the number of rows and columns you want. At least 2 by 2.");
				System.out.println("Rows:");
				int row=scan.nextInt();
				System.out.println("Columns:");
				int col=scan.nextInt();
				System.out.println("Generating map and army...");
				Thread.sleep(2000);
				map=new String[row][col];
				for(int i=0;i<=col; i++)
					{
						System.out.print(i+"|");
					}
				System.out.println();
				for(int i=0;i<=col; i++)
					{
						System.out.print("--");
					}
				System.out.println();
				for(int i=0;i<row;i++)
					{
						System.out.print((i+1)+"|");
						for(int j=0;j<col;j++)
							{
								if(i==0&&j==0)
									{
										map[i][j]="A";
									}
								else if(i==0&&j==1)
									{
										map[i][j]="a";
									}
								else
									{
										if((int)(Math.random()*3)==1)
											{
												map[i][j]="a";
											}
										else if((int)(Math.random()*3)==2)
											{
												map[i][j]="A";
											}
										else
											{
												map[i][j]=" ";
											}
									}
								System.out.print(map[i][j]+"|");
							}
						System.out.println();
						for(int j=0;j<=col;j++)
							{
								System.out.print("--");
							}
						System.out.println();
					}
				Thread.sleep(2000);
				System.out.println("'A' represents your army while 'a' represents the opponent's army. Blank areas represent unoccupied areas. All you need to do is conquer your opponent's areas to win!");
				Thread.sleep(2000);
				System.out.println("Now, what mode do you want? Easy mode (type 1)? Or survive mode (any other number)?");
				int mode=scan.nextInt();
				if(mode==1)
					{
						System.out.println("Wise choice");
						Thread.sleep(1000);
					}
				else
					{
						System.out.println("Well, be prepared... ");
						System.out.println("");
//						System.out.println("\      /");
//						
						System.out.println("");
						Thread.sleep(1000);
						hell=true;
					}
			}
		public static void printMap(int x, int y)
			{
				System.out.println("Current map:");
				for(int i=0;i<=map[0].length; i++)
					{
						System.out.print(i+"|");	
					}
				System.out.println();
				for(int i=0;i<=map.length; i++)
					{
						System.out.print("--");
					}
				System.out.println();
				for(int i=0;i<map.length;i++)
					{
						System.out.print((i+1)+"|");;
						for(int j=0;j<=map[0].length;j++)
							{
								if(j!=0)
									{
										System.out.print(map[i][j-1]+"|");
									}
							}
						System.out.println();
						for(int j=0;j<=map[0].length;j++)
							{
								System.out.print("--");
							}
						System.out.println();
					}
			}
		public static void playerTurn() throws InterruptedException
			{
				Scanner move=new Scanner(System.in);
				int number=0;
				int moveChance=0;
				int x=map.length;
				int y=map[0].length;
				int area=x*y;
				for(int i=0;i<x;i++)
					{
						for(int j=0;j<y;j++)
							{
								if(map[i][j].equals("A"))
									{
										number++;
									}
							}
					}
				if(area/number<=2)
					{
						moveChance=3;
					}
				else if(area/number>2&&area/number<=4)
					{
						moveChance=2;
					}
				else
					{
						moveChance=1;
					}
				System.out.println("Now, you control "+number+" area(s), so you have "+moveChance+" turn(s) left.");
				Thread.sleep(1000);
				for(int i=moveChance;i>0;i--)
					{
						System.out.println("Your turns left: "+i+". Choose the location you want to invade:");
						System.out.println("Row:");
						int xaxis=move.nextInt();
						System.out.println("Column:");
						int yaxis=move.nextInt();
						if(!map[xaxis-1][yaxis-1].equals("A"))
							{
								map[xaxis-1][yaxis-1]="A";
								printMap(map.length,map[0].length);
							}
						else
							{
								System.out.println("Oops, too bad. This is not occupied by the opponent. You wasted your turn!");
							}
						checkAI();
						if(win)
							{
								break;
							}
					}
			}
		public static void aiTurn()throws InterruptedException
			{
				System.out.println("Now, it's the opponent's turn to attack.");
				Scanner move=new Scanner(System.in);
				int number=0;
				int moveChance=0;
				int x=map.length;
				int y=map[0].length;
				int area=x*y;
				for(int i=0;i<x;i++)
					{
						for(int j=0;j<y;j++)
							{
								if(map[i][j].equals("a"))
									{
										number++;
									}
							}
					}
				if(area/number<=2)
					{
						moveChance=3;
					}
				else if(area/number>2&&area/number<=4)
					{
						moveChance=2;
					}
				else
					{
						moveChance=1;
					}
				System.out.println("Now, the opponent controls "+number+" area(s), so it has "+moveChance+" turn(s) left.");
				Thread.sleep(1500);
				for(int i=moveChance;i>0;i--)
					{
						int replaceX=0;
						int replaceY=0;
						boolean target=true;
						while(target)
							{
								int xAxis=(int)(Math.random()*(map.length-1));
								int yAxis=(int)(Math.random()*(map[0].length-1));
								if(!map[xAxis][yAxis].equals("a"))
									{
										target=false;
										map[xAxis][yAxis]="a";
										replaceX=xAxis;
										replaceY=yAxis;
									}
							}
						System.out.println("The opponent chose to attack ("+(replaceX+1)+", "+(replaceY+1)+")");
						Thread.sleep(1500);
						printMap(map.length,map[0].length);
						checkPlayer();
						if(lose)
							{
								break;
							}
					}
			}
		public static void aiWiseTurn()throws InterruptedException
			{
				System.out.println("Now, it's the opponent's turn to attack.");
				Scanner move=new Scanner(System.in);
				int number=0;
				int moveChance=0;
				int x=map.length;
				int y=map[0].length;
				int area=x*y;
				for(int i=0;i<x;i++)
					{
						for(int j=0;j<y;j++)
							{
								if(map[i][j].equals("a"))
									{
										number++;
									}
							}
					}
				if(area/number<=2)
					{
						moveChance=4;
					}
				else if(area/number>2&&area/number<=4)
					{
						moveChance=3;
					}
				else
					{
						moveChance=2;
					}
				System.out.println("Now, the opponent controls "+number+" area(s), so it has "+moveChance+" turn(s) left.");
				Thread.sleep(1500);
				for(int i=moveChance;i>0;i--)
					{
						int replaceX=0;
						int replaceY=0;
						boolean target=true;
						while(target)
							{
								int xAxis=(int)(Math.random()*(map.length-1));
								int yAxis=(int)(Math.random()*(map[0].length-1));
								if(map[xAxis][yAxis].equals("A"))
									{
										target=false;
										map[xAxis][yAxis]="a";
										replaceX=xAxis;
										replaceY=yAxis;
									}
							}
						System.out.println("The enemy chose to attack ("+(replaceX+1)+", "+(replaceY+1)+")");
						Thread.sleep(1500);
						printMap(map.length,map[0].length);
						checkPlayer();
						if(lose)
							{
								break;
							}
					}
			}
	}