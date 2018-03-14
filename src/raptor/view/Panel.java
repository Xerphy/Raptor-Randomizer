package raptor.view;

import raptor.controller.Controller;
import raptor.model.Champion;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Panel extends JPanel
{
	private Controller appController;
	private SpringLayout appLayout;
	
	private JLabel nameLabel;
	private JLabel titleLabel;
	private JLabel championPicLabel;
	
	private JLabel summonerSpell1;
	private JLabel summonerSpell2;
	
	private JLabel runesKeystone;
	private JLabel runes1Slot1;
	private JLabel runes1Slot2;
	private JLabel runes1Slot3;
	private JLabel runes2Slot1;
	private JLabel runes2Slot2;
	
	private JLabel item1;
	private JLabel item2;
	private JLabel item3;
	private JLabel item4;
	private JLabel item5;
	private JLabel item6;
	
	private JButton randomizeButton;
	
	public Panel(Controller appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		nameLabel = new JLabel("Name", SwingConstants.CENTER);
		nameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		
		titleLabel = new JLabel("Title", SwingConstants.CENTER);
		titleLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		
		championPicLabel = new JLabel("");
		championPicLabel.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/200x380Box.jpg")));
		championPicLabel.setHorizontalAlignment(JLabel.CENTER);
		
		summonerSpell1 = new JLabel("");
		summonerSpell1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		summonerSpell1.setHorizontalAlignment(JLabel.CENTER);
		
		summonerSpell2 = new JLabel("");
		summonerSpell2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		summonerSpell2.setHorizontalAlignment(JLabel.CENTER);

		
		runesKeystone = new JLabel("");
		runesKeystone.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		runesKeystone.setHorizontalAlignment(SwingConstants.CENTER);
		
		runes1Slot1 = new JLabel("");
		runes1Slot1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		runes1Slot1.setHorizontalAlignment(JLabel.CENTER);
		
		runes1Slot2 = new JLabel("");
		runes1Slot2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		runes1Slot2.setHorizontalAlignment(JLabel.CENTER);
		
		runes1Slot3 = new JLabel("");
		runes1Slot3.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		runes1Slot3.setHorizontalAlignment(JLabel.CENTER);
		
		runes2Slot1 = new JLabel("");
		runes2Slot1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		runes2Slot1.setHorizontalAlignment(JLabel.CENTER);
		
		runes2Slot2 = new JLabel("");
		runes2Slot2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		runes2Slot2.setHorizontalAlignment(JLabel.CENTER);
		
		
		item1 = new JLabel("");
		item1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		item1.setHorizontalAlignment(JLabel.CENTER);
		
		item2 = new JLabel("");
		item2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		item2.setHorizontalAlignment(JLabel.CENTER);
		
		item3 = new JLabel("");
		item3.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		item3.setHorizontalAlignment(JLabel.CENTER);
		
		item4 = new JLabel("");
		item4.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		item4.setHorizontalAlignment(JLabel.CENTER);
		
		item5 = new JLabel("");
		item5.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		item5.setHorizontalAlignment(JLabel.CENTER);
		
		item6 = new JLabel("");
		item6.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/64x64Box.png")));
		item6.setHorizontalAlignment(JLabel.CENTER);
		
		
		randomizeButton = new JButton("Randomize");
		randomizeButton.setFont(new Font("Serif", Font.PLAIN, 15));
		randomizeButton.setFocusPainted(false);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(new Color(220, 20, 60));
		this.setLayout(appLayout);
		
		this.add(nameLabel);
		this.add(titleLabel);
		this.add(championPicLabel);
		
		this.add(summonerSpell1);
		this.add(summonerSpell2);
		
		this.add(runesKeystone);
		this.add(runes1Slot1); 			//Testing
		this.add(runes1Slot2); 			//Testing
		this.add(runes1Slot3); 			//Testing
		this.add(runes2Slot1);	      	//Testing
		this.add(runes2Slot2);			//Testing
		
		this.add(item1);					//Testing
		this.add(item2);					//Testing
		this.add(item3);					//Testing
		this.add(item4);					//Testing
		this.add(item5);					//Testing
		this.add(item6);					//Testing
		
		this.add(randomizeButton);
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, championPicLabel, -440, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, championPicLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -6, SpringLayout.NORTH, titleLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, titleLabel);
		appLayout.putConstraint(SpringLayout.NORTH, titleLabel, 52, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 20, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, titleLabel, 11, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 11, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.NORTH, championPicLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, championPicLabel, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, summonerSpell2, 17, SpringLayout.SOUTH, titleLabel);
		appLayout.putConstraint(SpringLayout.WEST, summonerSpell2, 357, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, summonerSpell1, 0, SpringLayout.SOUTH, summonerSpell2);
		appLayout.putConstraint(SpringLayout.EAST, summonerSpell1, -27, SpringLayout.WEST, summonerSpell2);
		appLayout.putConstraint(SpringLayout.EAST, runes1Slot1, -80, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, runesKeystone, 0, SpringLayout.WEST, runes1Slot1);
		appLayout.putConstraint(SpringLayout.SOUTH, runesKeystone, -6, SpringLayout.NORTH, runes1Slot1);
		appLayout.putConstraint(SpringLayout.WEST, item6, 26, SpringLayout.EAST, item5);
		appLayout.putConstraint(SpringLayout.WEST, item3, 0, SpringLayout.WEST, item6);
		appLayout.putConstraint(SpringLayout.NORTH, item6, 0, SpringLayout.NORTH, item4);
		appLayout.putConstraint(SpringLayout.NORTH, randomizeButton, 27, SpringLayout.SOUTH, item1);
		appLayout.putConstraint(SpringLayout.WEST, randomizeButton, 63, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, randomizeButton, -18, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, randomizeButton, -239, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, item5, 0, SpringLayout.NORTH, item4);
		appLayout.putConstraint(SpringLayout.WEST, item5, 25, SpringLayout.EAST, item4);
		appLayout.putConstraint(SpringLayout.WEST, item4, 11, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, item4, -159, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, item1, 24, SpringLayout.SOUTH, item4);
		appLayout.putConstraint(SpringLayout.WEST, runes1Slot3, 42, SpringLayout.EAST, item3);
		appLayout.putConstraint(SpringLayout.WEST, runes1Slot2, 42, SpringLayout.EAST, item3);
		appLayout.putConstraint(SpringLayout.EAST, titleLabel, 0, SpringLayout.EAST, item3);
		appLayout.putConstraint(SpringLayout.NORTH, item3, 0, SpringLayout.NORTH, item1);
		appLayout.putConstraint(SpringLayout.NORTH, item2, 0, SpringLayout.NORTH, item1);
		appLayout.putConstraint(SpringLayout.WEST, item2, 25, SpringLayout.EAST, item1);
		appLayout.putConstraint(SpringLayout.WEST, item1, 11, SpringLayout.EAST, championPicLabel);
		appLayout.putConstraint(SpringLayout.WEST, runes2Slot2, 6, SpringLayout.EAST, runes1Slot2);
		appLayout.putConstraint(SpringLayout.SOUTH, runes2Slot2, 0, SpringLayout.SOUTH, runes1Slot2);
		appLayout.putConstraint(SpringLayout.NORTH, runes1Slot3, 6, SpringLayout.SOUTH, runes1Slot2);
		appLayout.putConstraint(SpringLayout.WEST, runes2Slot1, 6, SpringLayout.EAST, runes1Slot1);
		appLayout.putConstraint(SpringLayout.SOUTH, runes2Slot1, 0, SpringLayout.SOUTH, runes1Slot1);
		appLayout.putConstraint(SpringLayout.SOUTH, runes1Slot1, -6, SpringLayout.NORTH, runes1Slot2);
		appLayout.putConstraint(SpringLayout.SOUTH, runes1Slot2, -104, SpringLayout.SOUTH, this);
	}
	
	private void updateInfo()
	{
		Champion currentChampion = randomizeChampion();
		ArrayList<String> summonerSpells = randomizeSummonerSpells();
		ArrayList<String> runes = randomizeRunes();
		
		
		nameLabel.setText(currentChampion.getName());
		titleLabel.setText(currentChampion.getTitle());
		
		championPicLabel.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/champions/" + currentChampion.getNameForFile() 
								 + "Picture.jpg")));
		
		summonerSpell1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/spells/" + summonerSpells.get(0) 
							     + "Picture.png")));
		
		summonerSpell2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/spells/" 
							     + summonerSpells.get(summonerSpells.size() - 1) + "Picture.png")));
		
		runesKeystone.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
				   			     + runes.get(1) + "Picture.png")));
		
		runes1Slot1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/"
								 + runes.get(1) + "Picture.png")));	//Change as runes are added
		
		runes1Slot2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
								 + runes.get(1) + "Picture.png")));	//Change as runes are added
		
		runes1Slot3.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
							 	 + runes.get(1) + "Picture.png")));  //Change as runes are added
		
		runes2Slot1.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
								 + runes.get(1) + "Picture.png")));  //Change as runes are added
		
		runes2Slot2.setIcon(new ImageIcon(Panel.class.getResource("/raptor/view/images/runes/" 
								 + runes.get(1) + "Picture.png")));  //Change as runes are added
	}
	
	private Champion randomizeChampion()
	{
		Random randomNum = new Random();
		int selectedChampionIndex;
		Champion selectedChampion;
		
		selectedChampionIndex = randomNum.nextInt(appController.getChampionList().size());
		selectedChampion = appController.getChampionList().get(selectedChampionIndex);
		
		return selectedChampion;
	}
	
	private ArrayList<String> randomizeSummonerSpells()
	{
		ArrayList<String> currentSummonerSpellList = new ArrayList<String>();
		Random randomNum = new Random();
		int secondSpellindex = 0;
		
		currentSummonerSpellList.add(appController.getSummonerSpellList().get(randomNum.nextInt(appController.getSummonerSpellList().size())));
		
		while (currentSummonerSpellList.get(0).equals(currentSummonerSpellList.get(secondSpellindex)))
		{
			secondSpellindex++;
			currentSummonerSpellList.add(appController.getSummonerSpellList().get(randomNum.nextInt(appController.getSummonerSpellList().size())));
		}
		
		return currentSummonerSpellList;
	}
	
	private ArrayList<String> randomizeRunes()
	{
		ArrayList<String> allRunes = new ArrayList<String>();
		Random randomNum = new Random();
		
		int runesPath = randomNum.nextInt(5);	//Need to update as more paths are added
		
		switch (runesPath)			//Picks the main rune path as well as the keystone and minor runes for that path
		{
        case 0:  allRunes.add("Precision");
        
        		 ArrayList<String> PrecisionKeystones = new ArrayList<>();
        		 PrecisionKeystones.add("PressTheAttack");
        		 PrecisionKeystones.add("LethalTempo");
        		 PrecisionKeystones.add("FleetFootwork");
        		 allRunes.add(PrecisionKeystones.get(randomNum.nextInt(PrecisionKeystones.size())));
        		 
        		 int slot1Rune = randomNum.nextInt(3);
        		 int slot2Rune = randomNum.nextInt(3);
        		 int slot3Rune = randomNum.nextInt(3);
        		 
        		 if(slot1Rune == 1)
        		 {
        			 allRunes.add("Overheal");
        		 }
        		 else if(slot1Rune == 2)
        		 {
        			 allRunes.add("Triumph");
        		 }
        		 else if(slot1Rune == 3)
        		 {
        			 allRunes.add("Presence of Mind");
        		 }
        		 
        		 if(slot2Rune == 1)
        		 {
        			 allRunes.add("Legend: Alacrity");
        		 }
        		 else if(slot2Rune == 2)
        		 {
        			 allRunes.add("Legend: Tenacity");
        		 }
        		 else if(slot2Rune == 3)
        		 {
        			 allRunes.add("Legend: Bloodline");
        		 }
        		 
        		 if(slot3Rune == 1)
        		 {
        			 allRunes.add("Coup de Grace");
        		 }
        		 else if(slot3Rune == 2)
        		 {
        			 allRunes.add("Cut Down");
        		 }
        		 else if(slot3Rune == 3)
        		 {
        			 allRunes.add("Last Stand");
        		 }
        		 
             break;
                 
        case 1:  allRunes.add("Domination");
        
        		 ArrayList<String> DominationKeystones = new ArrayList<>();
        		 DominationKeystones.add("Electrocute");
        		 DominationKeystones.add("Predator");
        		 DominationKeystones.add("DarkHarvest");
        		 allRunes.add(DominationKeystones.get(randomNum.nextInt(DominationKeystones.size())));
        		 break;
        
        case 2:  allRunes.add("Sorcery");
        
        		 ArrayList<String> SorceryKeystones = new ArrayList<>();
        		 SorceryKeystones.add("SummonAery");
        		 SorceryKeystones.add("ArcaneComet");
        		 SorceryKeystones.add("PhaseRush");
        		 allRunes.add(SorceryKeystones.get(randomNum.nextInt(SorceryKeystones.size())));
        		 break;
              
        case 3:  allRunes.add("Resolve");
        
       		 ArrayList<String> ResolveKeystones = new ArrayList<>();
       		 ResolveKeystones.add("GraspOfTheUndying");
       		 ResolveKeystones.add("Aftershock");
       		 ResolveKeystones.add("Guardian");
       		 allRunes.add(ResolveKeystones.get(randomNum.nextInt(ResolveKeystones.size())));
       		 break;
       			 
        case 4:  allRunes.add("Inspiration");
                 
        		 ArrayList<String> InspirationKeystones = new ArrayList<>();
        		 InspirationKeystones.add("UnsealedSpellbook");
        		 InspirationKeystones.add("GlacialAugment");
        		 InspirationKeystones.add("Kleptomancy");
        		 allRunes.add(InspirationKeystones.get(randomNum.nextInt(InspirationKeystones.size())));
        		 break;
        
        default: allRunes.add("InvalidPath");
        
        		 allRunes.add("InvalidKeystone");
        		 break;
		}
		
		return allRunes;
	}
	
	private void setupListeners()
	{
		randomizeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				updateInfo();
			}
		});
	}
}
