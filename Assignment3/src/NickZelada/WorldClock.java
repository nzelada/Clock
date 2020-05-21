


/**
 * PART II. Provide a subclass of Clock namded WorldClock whose constructor
 * accepts a time offset. For example, if you live in California, a new
 * WorldClock(3) should show the time in New York, three time zones ahead. You
 * should not override getTime.
 * 
 * @author Nick Zelada
 * @version 02/13/19
 * I affirm that this program is entirely my own work and other person's work
 * is involved.
 */
public class WorldClock extends Clock {

    int offsetTime; // integer for offset time
/**
 * sets the offset time
 * @param offset offset time for WorldClock
 */
    public WorldClock(int offset) {
        offsetTime = offset; /* offsetTime being set to the offset of the
                                       parameter */

    }
    @Override
    /**
     * overrides the getHours method from the super class with the new
     * hour using the offset time.
     * @return updated hour with offset
     */
   public String getHours()
   {
      
      int hours = Integer.parseInt(super.getHours()); //get current hours

     
      hours = hours + offsetTime; // add offsetTime to hours
      if (hours > 24) 
      { // if the hour is great than 24, it will substract 24. Ex 25-24 = 1
         hours = hours - 24;
      }
      else if (hours < 0)
      { // if the hour is less than 0, it will add 24. Ex -1 + 24 = 23
         hours = hours + 24;
      }

     
      return Integer.toString(hours); // returns the updated hour
   }

}
