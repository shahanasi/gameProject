import java.util.ArrayList;
import java.util.Scanner;
//
public class Program
	{
		public static void main(String[] args)
			{
				Scanner input=new Scanner(System.in);
				
				ArrayList<String> names=new ArrayList<String>();
				names.add("Derek");
				names.add("Jane");
				names.add("Dan");
				names.add("Lena");
				names.add("Gabriel");
				names.add("Sasha");
				names.add("Dylan");
				names.add("Bianca");
				ArrayList<String> hairs=new ArrayList<String>();
				hairs.add("black");
				hairs.add("brown");
				hairs.add("red");
				hairs.add("blonde");
				ArrayList<Integer> ages=new ArrayList<Integer>();
				ages.add(23);
				ages.add(24);
				ages.add(25);
				ages.add(26);
				ArrayList<Integer> heights=new ArrayList<Integer>();
				heights.add(5);
				heights.add(6);
				
				System.out.println("What gender are you looking for? Type either 'm' for male or 'f' for female.");
				String choiceGender=input.nextLine();
				System.out.println("What hair color do you prefer? You can choose from black, brown, red, and blonde.");
				String choiceHair=input.nextLine();
				System.out.println("What age do you prefer? You can choose from 23-26.");
				int choiceAge=input.nextInt();
				System.out.println("What height in feet do you prefer? You can choose either 5 or 6.");
				int choiceHeight=input.nextInt();
				
				String dateName="Your date's name is ";
				String noHair="I'm sorry. We do not have anyone with that hair color.";
				String noAge="I'm sorry. We do not have anyone at that age.";
				String noHeight="I'm sorry. We do not have anyone at that height.";
				String noDescription="There is no one who fits your description. You will be forever alone.";
				
				if(choiceGender.equals("m"))
					{
						if(choiceHair.equals("black"))
							{
								if(choiceAge==23)
									{
										if(choiceHeight==5)
											{
												System.out.println("");
												System.out.println(dateName+"Derek!");
											}
										else
											{
												System.out.println("");
												System.out.println(noHeight);
												System.out.println(noDescription);
											}
									}
								else
									{
										System.out.println("");
										System.out.println(noAge);
										System.out.println(noDescription);
									}
							}
						else if(choiceHair.equals("brown"))
							{
								if(choiceAge==26)
									{
										if(choiceHeight==6)
											{
												System.out.println("");
												System.out.println(dateName+"Dylan!");
											}
										else
											{
												System.out.println("");
												System.out.println(noHeight);
												System.out.println(noDescription);
											}
									}
								else
									{
										System.out.println("");
										System.out.println(noAge);
										System.out.println(noDescription);
									}
							}
						else if(choiceHair.equals("red"))
							{
								if(choiceAge==25)
									{
										if(choiceHeight==6)
											{
												System.out.println("");
												System.out.println(dateName+"Gabriel!");
											}
										else
											{
												System.out.println("");
												System.out.println(noHeight);
												System.out.println(noDescription);
											}
									}
								else
									{
										System.out.println("");
										System.out.println(noAge);
										System.out.println(noDescription);
									}
							}
						else if(choiceHair.equals("blonde"))
							{
								if(choiceAge==24)
									{
										if(choiceHeight==5)
											{
												System.out.println("");
												System.out.println(dateName+"Dan!");
											}
										else
											{
												System.out.println("");
												System.out.println(noHeight);
												System.out.println(noDescription);
											}
									}
								else
									{
										System.out.println("");
										System.out.println(noAge);
										System.out.println(noDescription);
									}
							}
						else
							{
								System.out.println("");
								System.out.println(noHair);
								System.out.println(noDescription);
							}
					}
				else if(choiceGender.equals("f"))
					{
						if(choiceHair.equals("black"))
							{
								if(choiceAge==25)
									{
										if(choiceHeight==5)
											{
												System.out.println("");
												System.out.println(dateName+"Sasha!");
											}
										else
											{
												System.out.println("");
												System.out.println(noHeight);
												System.out.println(noDescription);
											}
									}
								else
									{
										System.out.println("");
										System.out.println(noAge);
										System.out.println(noDescription);
									}
							}
						else if(choiceHair.equals("brown"))
							{
								if(choiceAge==23)
									{
										if(choiceHeight==6)
											{
												System.out.println("");
												System.out.println(dateName+"Jane!");
											}
										else
											{
												System.out.println("");
												System.out.println(noHeight);
												System.out.println(noDescription);
											}
									}
								else
									{
										System.out.println("");
										System.out.println(noAge);
										System.out.println(noDescription);
									}	
							}
						else if(choiceHair.equals("red"))
							{
								if(choiceAge==24)
									{
										if(choiceHeight==5)
											{
												System.out.println("");
												System.out.println(dateName+"Lena!");
											}
										else
											{
												System.out.println("");
												System.out.println(noHeight);
												System.out.println(noDescription);
											}
									}
								else
									{
										System.out.println("");
										System.out.println(noAge);
										System.out.println(noDescription);
									}
							}
						else if(choiceHair.equals("blonde"))
							{
								if(choiceAge==26)
									{
										if(choiceHeight==6)
											{
												System.out.println("");
												System.out.println(dateName+"Bianca!");
											}
										else
											{
												System.out.println("");
												System.out.println(noHeight);
												System.out.println(noDescription);
											}
									}
								else
									{
										System.out.println("");
										System.out.println(noAge);
										System.out.println(noDescription);
									}
							}
						else
							{
								System.out.println("");
								System.out.println(noHair);
								System.out.println(noDescription);
							}
					}
				else
					{
						System.out.println("");
						System.out.println("That is not a valid gender.");
						System.out.println(noDescription);
					}
			}
	}