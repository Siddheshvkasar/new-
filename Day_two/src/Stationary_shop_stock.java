
public class Stationary_shop_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final int pen_price = 10, ball_pen_price = 15, notebook_p = 60, craft_paper_p= 12, stapler_p = 137, glue_p =18, glue_gun_p=200;
		final double cello_tape_p=18.25;
		
		double pen_st = pen_price *275;
		double ball_st = ball_pen_price*135;
		double noteBook_st = notebook_p*225;
		double craft_st = craft_paper_p*1025;
		double stapler_st = stapler_p*67;
		double glue_st = glue_p*89;
		double glue_gun_st = glue_gun_p*30;
		double cello_Tape_st = cello_tape_p*200;
		double total_stock_shop = pen_st+ball_st+noteBook_st+craft_st+stapler_st+glue_st+glue_gun_st+cello_Tape_st;
		System.out.println("The total stocks available in shop = "+total_stock_shop);

	}

}
