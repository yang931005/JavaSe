package cn.zucc.day04;

public class Master {
	public void cure(Pet pet){
		pet.cure();
	}
	public void play(Pet pet){
		if(pet instanceof Dog){
			Dog dog = (Dog)pet;
			dog.catchingFlyDisc();
		}else if(pet instanceof Penguin){
			Penguin pgn = (Penguin)pet;
			pgn.swimming();
		}
	}
}
