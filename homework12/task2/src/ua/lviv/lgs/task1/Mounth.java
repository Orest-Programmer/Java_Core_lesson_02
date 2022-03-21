
package ua.lviv.lgs.task1;
/**
 * @author Orest
 */
public enum Mounth {
	/* Enum of mounth. 
	 * 	add mounth
	 * */
	JANUARY(31, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER), MARCH(31, Seasons.SPRING), APRIL(30, Seasons.SPRING), MAY(31, Seasons.SPRING),
	JUNE(30, Seasons.SUMMER), JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER), SEPTEMBER(30, Seasons.AUTUMN), OCTOBER(31, Seasons.AUTUMN),
	NOVEMBER(30, Seasons.AUTUMN), DECEMBER(31, Seasons.WINTER);

	int days;
	Seasons seasons;

	private Mounth(int days, Seasons seasons) {
		/* Constructor for Mounth */
		this.days = days;
		this.seasons = seasons;
	}

	public int getDays() {
		/* Getter for days */
		return days;
	}

	public Seasons getSeasons() {
		/* Getter for seasons */
		return seasons;
	}

}
