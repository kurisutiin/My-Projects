package com.example.vocabularybuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VocabularyBuilder {
	/** Author: Christine Harding
	 * Program: Vocabulary Builder
	 * Date: 11/22/2014
	 * Purpose: To improve one's language skills. 
	 * 
	 * Updated: 01/25/2015
	 * Added Verbs and Adjectives
	 * 
	 * Updated: 01/27/2015
	 * Made minor adjustments and added loops
	 * 
	 * Updated: 02/02/2015
	 * Added an option for the user to pick a language to study*/
	
	
	

	public static void main(String[] args)  throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Language lang = new Language();
		int choice = 0;
		String answer;
		String word;
		int numattempts = 4;
		boolean pass = false;
		int nchoice = 0;
		
		//Word Bank
		
		//English Nouns
		Language words[] = new Language[29];
		for(int i = 0; i < words.length; i++)
		{words[i] = new Language();}
		
		words[0].enoun = "I";
		words[1].enoun = "You";
		words[2].enoun = "They";
		words[3].enoun = "We";
		words[4].enoun = "Shoes";
		words[5].enoun = "Park";
		
		//Japanese Nouns
		
		words[6].jnoun = "Watashi";
		words[7].jnoun = "Anata";
		words[8].jnoun = "Ano hitotachi";
		words[9].jnoun = "Watashitachi";
		words[10].jnoun = "Kutsu";
		words[11].jnoun = "Kouen";
		
		//Eng Verbs
		words[12].everb = "to meet, to see";
		words[13].everb ="to wash";
		words[14].everb = "to be";
		words[15].everb = "to have";
		words[28].everb = "to walk";
		
		//jpn verb
		words[16].jverb ="Au";
		words[17].jverb = "Arau";
		words[18].jverb = "Aru";
		words[19].jverb = "Aruku";
		
		//eng adjective
		words[20].eadj = "Bright/cheerful";
		words[21].eadj = "Warm/mild";
		words[22].eadj = "New";
		words[23].eadj = "Hot";
		
		//jpn adjectives
		words[24].jadj = "Akarui";
		words[25].jadj = "Atatakai";
		words[26].jadj = "Atarashii";
		words[27].jadj = "Atsui";
		
		
		//Native Language Choice
		
		
		System.out.println("Please choose your native language: 1 - English, 2 - Japanese \nげんごをせんたくしてください:　１‐　えいご　２　‐　にほんご ");
		choice = Integer.parseInt(br.readLine());
		
		if(choice == 1)
		{System.out.print("What Language would you like to study today? 1 - English, 2 - Japanese");
		
		}
		else if(choice == 2)
		{System.out.print("What Language would you like to study today? 1 - English, 2 - Japanese");
		
		}
		else
		System.out.print("Sorry we don't have that Language.");
		System.exit(0);
		
		nchoice = Integer.parseInt(br.readLine());
		
		
		//Part of Speech Choice
		
		
		if(nchoice == 1)
		{System.out.println("Welcome to Vocabulary Builder.\nWhat would you like to learn? Nouns, Verbs, Adjectives ");
		
		}
		else if (nchoice == 2)
		{System.out.println("Vocabulary Builderでようこそ.\nなにをべんきょしたいですか？めいし, どうし, けいようし\nNani wo benkyoshitai desu ka? Meishi, Doushi, Keiyoushi ");
		
		}
		else
		{System.out.print("Invalid");
		System.exit(0);
		
		}
		
	
		 answer = br.readLine();

		if((choice == 1) && (answer.equalsIgnoreCase("nouns")))
		{System.out.print("Type in Noun: ");
		
		}
		else if((choice == 1) && (answer.equalsIgnoreCase("verbs")))
		{System.out.print("Type in Verb: "); 
		
		}
		else if((choice == 1) && (answer.equalsIgnoreCase("adjectives")))
		{System.out.print("Type in Adjective: ");
		
		}
		else if((choice == 2) && (answer.equals("名詞")) || (answer.equals("めいし")) || (answer.equalsIgnoreCase("meishi")))
		{System.out.print("名詞（めいし）でタイプ: ");
		
		}
		else if((choice == 2) && (answer.equals("動詞")) || (answer.equals("どうし")) || (answer.equalsIgnoreCase("doushi")))
		{System.out.print("動詞（どうし）でタイプ: ");
		
		}
		else if((choice == 2) && (answer.equals("形容詞")) || (answer.equals("けいようし")) || (answer.equalsIgnoreCase("keiyoushi")))
		{System.out.print("形容詞（けいようし）でタイプ: ");
		
		}
		
		else
		
		{System.out.print("Input invalid.");
		System.exit(0);
		
		}

		
		word = br.readLine();
		
		//E.nouns
		
		
			
		for(int i = 0; i < words.length;)
		{
		if((words[i].enoun == word) || (word.equalsIgnoreCase("I")))
		{System.out.println(words[0].enoun + " means " + words[6].jnoun + " in Japanese.");
		pass = true;
		break;
		}
		
		else if((words[i].enoun == word) || (word.equalsIgnoreCase("You"))) 
		{System.out.print(words[1].enoun + " means " + words[7].jnoun + " in Japanese.");
		pass = true;
		break;
		}
			
		else if((words[i].enoun == word) || (word.equalsIgnoreCase("They")))
		{System.out.print(words[2].enoun + " means " + words[8].jnoun + " in Japanese.");
		pass = true;
		break;
		}
		
		else if((words[i].enoun == word) || (word.equalsIgnoreCase("We")))
		{System.out.print(words[3].enoun + " means " + words[9].jnoun + " in Japanese.");
		pass = true;
		break;
		}
		
		else if((words[i].enoun == word) || (word.equalsIgnoreCase("Shoes")))
		{System.out.print(words[4].enoun + " means " + words[10].jnoun + " in Japanese.");
		pass = true;
		break;
		}
		
		else if((words[i].enoun == word) || (word.equalsIgnoreCase("Park")))
		{System.out.print(words[5].enoun + " means " + words[11].jnoun + " in Japanese.");
		pass = true;
		break;
		}
		
		//J.nouns 
		else if((words[i].jnoun == word) || (word.equalsIgnoreCase("Watashi")) || (word.equals("わたし")))
		{System.out.println(words[6].jnoun + "はえいごで" + words[0].enoun + "をいみします。");
		pass = true;
		break;
		}
		
		else if((words[i].jnoun == word) || (word.equalsIgnoreCase("anata")) || (word.equals("あなた")) || (word.equals("きみ")))
		{System.out.print(words[7].jnoun + "はえいごで" + words[1].enoun + "をいみします。");
		pass = true;
		break;
		}
			
		else if((words[i].jnoun == word) || (word.equalsIgnoreCase("ano hitotachi")) || (word.equals("あのひとたち")))
		{System.out.print(words[8].jnoun + "はえいごで" + words[2].enoun + "をいみします。");
		pass = true;
		break;
		}
		
		else if((words[i].jnoun == word) || (word.equalsIgnoreCase("Watashitachi")) || (word.equals("わたしたち")))
		{System.out.print(words[9].jnoun + " はえいごで" + words[3].enoun + "をいみします。");
		pass = true;
		break;
		}
		
		else if((words[i].jnoun == word) || (word.equalsIgnoreCase("kutsu"))  || (word.equals("くつ")))
		{System.out.print(words[10].jnoun + "はえいごで" + words[4].enoun + "をいみします。");
		pass = true;
		break;
		}
		
		else if((words[i].jnoun == word) || (word.equalsIgnoreCase("kouen")) || (word.equals("こうえん")))
		{System.out.print(words[11].jnoun + "はえいごで" + words[5].enoun + "をいみします。");
		pass = true;
		break;
		}
		
		
		//E.Verbs
		if((words[i].everb == word) || (word.equalsIgnoreCase("to meet")) || (word.equalsIgnoreCase("to see")))
		
		{System.out.println(words[12].everb + " means " + words[16].jverb + " in Japanese.");
		pass = true;
		break;
		}
		
		else if((words[i].everb == word) || (word.equalsIgnoreCase("to wash"))) 
		{System.out.print(words[13].everb + " means " + words[17].jverb + " in Japanese.");
		pass = true;
		break;
		}
			
		else if((words[i].everb == word) || (word.equalsIgnoreCase("to be")) || (word.equalsIgnoreCase("to have")))
		{System.out.print(words[14].everb + "/" +  words[15].everb + "means " + words[18].jverb +  " in Japanese.");
		pass = true;
		break;
		}
		
		else if((words[i].everb == word) || (word.equalsIgnoreCase("to walk")))
		{System.out.print(words[28].everb + " means " + words[19].jverb + " in Japanese.");
		pass = true;
		break;
		}
		
		
		//J.Verbs
		else if((words[i].jverb == word) || (word.equalsIgnoreCase("Au")) || (word.equals("あう")))
		{System.out.println(words[16].jverb + "はえいごで" + words[12].everb + "をいみします。");
		pass = true;
		break;
		}
		
		else if((words[i].jverb == word) || (word.equalsIgnoreCase("Arau")) || (word.equals("あらう")))
		{System.out.print(words[17].jverb + "はえいごで" + words[13].everb + "をいみします。");
		pass = true;
		break;
		}
			
		else if((words[i].jverb == word) || (word.equalsIgnoreCase("Aru")) || (word.equals("ある")))
		{System.out.print(words[18].jverb + "はえいごで" + words[14].everb + "と" +words[15].everb + "をいみします。");
		pass = true;
		break;
		}
		
		else if((words[i].jverb == word) || (word.equalsIgnoreCase("Aruku")) || (word.equals("ある")))
		{System.out.print(words[19].jverb + " はえいごで" + words[28].everb + "をいみします。");
		pass = true;
		break;
		}
		
		
		//E.adjectives
		else if((words[i].eadj == word) || (word.equalsIgnoreCase("Bright")) || (word.equalsIgnoreCase("Cheerful")))
		{System.out.print(words[20].eadj + " means " + words[24].jadj + " in Japanese.");
		pass = true;
		break;
		}
		
		else if((words[i].eadj == word) || (word.equalsIgnoreCase("Warm")) || (word.equalsIgnoreCase("Mild")))
		{System.out.print(words[21].eadj + " means " + words[25].jadj + " in Japanese.");
		pass = true;
		break;
		}
		
		else if((words[i].eadj == word) || (word.equalsIgnoreCase("New")))
		{System.out.print(words[22].eadj + " means " + words[26].jadj + " in Japanese.");
		pass = true;
		break;
		}
		
		else if((words[i].eadj == word) || (word.equalsIgnoreCase("Hot")))
		{System.out.print(words[23].eadj + " means " + words[27].jadj + " in Japanese.");
		pass = true;
		break;
		}
		
		
		//J.adjectives
		else if((words[i].jadj == word) || (word.equalsIgnoreCase("Akarui"))  || (word.equals("あかるい")))
		{System.out.print(words[24].jadj + "はえいごで" + words[20].eadj + "をいみします。");
		pass = true;
		break;
		}
		
		else if((words[i].jadj == word) || (word.equalsIgnoreCase("Atatakai")) || (word.equals("あたたかい")))
		{System.out.print(words[25].jadj + "はえいごで" + words[21].eadj + "をいみします。");
		pass = true;
		break;
		}
		
		else if((words[i].jadj == word) || (word.equalsIgnoreCase("Atarashii"))  || (word.equals("あたらしい")))
		{System.out.print(words[26].jadj + "はえいごで" + words[22].eadj + "をいみします。");
		pass = true;
		break;
		}
		
		else if((words[i].jadj == word) || (word.equalsIgnoreCase("Atsui")) || (word.equals("あつい")))
		{System.out.print(words[27].jadj + "はえいごで" + words[23].eadj + "をいみします。");
		pass = true;
		break;
		}
		else
			if(choice == 1 && !pass)
			{System.out.print("Sorry. That word is not in our system at this time.");}
			
		    if(choice == 2 && !pass)
		    {System.out.print("ごめんなさい。そのことばは、このじてんでわれわれのシステムではありません。");}
		    
		
		}
		//Thank you message
		{System.out.print("\nThank you for using Vocabulay Builder.\nVocabulary Builderをしよう していただきありがとうございます。");
		System.exit(0);
		}
		

	
		
	


		
		}

	}




	

		
		
	



	