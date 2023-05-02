public class App
{
    public static void main( String[] args )
    {
        System.out.println("I am your awesome Java application!");

        DeepThought ourSuperComputer = new DeepThought();
        int ans = ourSuperComputer.answer_to_the_ultimate_question_of_life_the_universe_and_everything();
        System.out.println(ans);
        
        RedisJava cache = new RedisJava();
        cache.cache_value("answer_to_the_ultimate_question_of_life_the_universe_and_everything",String.valueOf(ans));

        System.out.println("Cached value: " + cache.get_cached_value("answer_to_the_ultimate_question_of_life_the_universe_and_everything"));
    }
}
