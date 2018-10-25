public class HorseBarn {
    private Horse[] spaces;
    public int findHorseSpace(String name)
    {
        for(int i = 0 ;i < this.spaces.length; i++)
        {
            if(this.spaces[i]!=null)
            {
                test = 1+idx;
            }
            idx++;
        }
        return test;
    }
    public void consolidate()
    {
        Horse copyArr = new Horse()[Horse.length];
        int idx = 0;
        for(int i=0 ; i < Horse.length; i++)
        {
            if(Horse[i] != null)
            {
                copyArr[idx] = Horse[i];
                idx++;
            }
        }
    }
}
