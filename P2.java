
package ScrapProjects;


public class P2 {
   
   private String name2;
   private int winCount;
   private int lossCount;
   
   public P2 (String name, int winCount, int lossCount)
   {
      this.name2 = name;
      this.winCount = winCount;
      this.lossCount = lossCount;
      
   }
   public void setName (String name)
   {
      this.name2 = name;
   }
   public String getName()
   {
      return name2;
   }
   
   public void setwinCount (int winCount)
   {
      this.winCount = winCount;
   }
   public int getwinCount()
   {
      return winCount;
   }
   
   public void setlossCount (int lossCount)
   {
      this.lossCount = lossCount;
   }
   public int getlossCount()
   {
      return lossCount;
      
   }
}
