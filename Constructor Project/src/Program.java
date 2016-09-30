import java.util.ArrayList;
import java.util.Scanner;

public class Program
	{
		public static void main(String[] args)
			{
				Scanner input=new Scanner(System.in);
				
				ArrayList<Person> harem=new ArrayList<Person>();
				harem.add(new Person("m", "1", 23, 5, "Derek"));
				harem.add(new Person("f", "2", 23, 6, "Jane"));
				harem.add(new Person("m", "4", 24, 5, "Dan"));
				harem.add(new Person("f", "3", 24, 5, "Lena"));
				harem.add(new Person("m", "3", 25, 6, "Gabriel"));
				harem.add(new Person("f", "1", 25, 5, "Sasha"));
				harem.add(new Person("m", "2", 26, 6, "Dylan"));
				harem.add(new Person("f", "4", 26, 6, "Bianca"));
				
//				ArrayList<String> names=new ArrayList<String>();
//				names.add("Derek");
//				names.add("Jane");
//				names.add("Dan");
//				names.add("Lena");
//				names.add("Gabriel");
//				names.add("Sasha");
//				names.add("Dylan");
//				names.add("Bianca");
//				ArrayList<String> hairs=new ArrayList<String>();
//				hairs.add("black");
//				hairs.add("brown");
//				hairs.add("red");
//				hairs.add("blonde");
//				ArrayList<Integer> ages=new ArrayList<Integer>();
//				ages.add(23);
//				ages.add(24);
//				ages.add(25);
//				ages.add(26);
//				ArrayList<Integer> heights=new ArrayList<Integer>();
//				heights.add(5);
//				heights.add(6);
				
				String dateName="Your date's name is ";
				String noHair="I'm sorry. We do not have anyone with that hair color.";
				String noAge="I'm sorry. We do not have anyone at that age.";
				String noHeight="I'm sorry. We do not have anyone at that height.";
				String noDescription="There is no one who fits your description. You will be forever alone.";
				
				System.out.println("What gender are you looking for? Type either 'm' for male or 'f' for female.");
				String choiceGender=input.nextLine();
				
				if(choiceGender.equals("m"))
					{
						System.out.println("What hair color do you prefer? You can choose 1 for black, 2 for brown, 3 for red, or 4 for blonde.");
						int choiceHair=input.nextInt();
						if(choiceHair==1)
							{
								System.out.println("What age do you prefer? You can choose from 23-26.");
								int choiceAge=input.nextInt();
								if(choiceAge==23)
									{
										System.out.println("What height in feet do you prefer? You can choose either 5 or 6.");
										int choiceHeight=input.nextInt();
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
						else if(choiceHair==2)
							{
								System.out.println("What age do you prefer? You can choose from 23-26.");
								int choiceAge=input.nextInt();
								if(choiceAge==26)
									{
										System.out.println("What height in feet do you prefer? You can choose either 5 or 6.");
										int choiceHeight=input.nextInt();
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
						else if(choiceHair==3)
							{
								System.out.println("What age do you prefer? You can choose from 23-26.");
								int choiceAge=input.nextInt();
								if(choiceAge==25)
									{
										System.out.println("What height in feet do you prefer? You can choose either 5 or 6.");
										int choiceHeight=input.nextInt();
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
						else if(choiceHair==4)
							{
								System.out.println("What age do you prefer? You can choose from 23-26.");
								int choiceAge=input.nextInt();
								if(choiceAge==24)
									{
										System.out.println("What height in feet do you prefer? You can choose either 5 or 6.");
										int choiceHeight=input.nextInt();
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
						System.out.println("What hair color do you prefer? You can choose 1 for black, 2 for brown, 3 for red, or 4 for blonde.");
						int choiceHair=input.nextInt();
						if(choiceHair==1)
							{
								System.out.println("What age do you prefer? You can choose from 23-26.");
								int choiceAge=input.nextInt();
								if(choiceAge==25)
									{
										System.out.println("What height in feet do you prefer? You can choose either 5 or 6.");
										int choiceHeight=input.nextInt();
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
						else if(choiceHair==2)
							{
								System.out.println("What age do you prefer? You can choose from 23-26.");
								int choiceAge=input.nextInt();
								if(choiceAge==23)
									{
										System.out.println("What height in feet do you prefer? You can choose either 5 or 6.");
										int choiceHeight=input.nextInt();
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
						else if(choiceHair==3)
							{
								System.out.println("What age do you prefer? You can choose from 23-26.");
								int choiceAge=input.nextInt();
								if(choiceAge==24)
									{
										System.out.println("What height in feet do you prefer? You can choose either 5 or 6.");
										int choiceHeight=input.nextInt();
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
						else if(choiceHair==4)
							{
								System.out.println("What age do you prefer? You can choose from 23-26.");
								int choiceAge=input.nextInt();
								if(choiceAge==26)
									{
										System.out.println("What height in feet do you prefer? You can choose either 5 or 6.");
										int choiceHeight=input.nextInt();
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