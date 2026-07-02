package com.music;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class MusicService {
    private List<Song> songDatabase;

    public MusicService() {
        songDatabase = new ArrayList<>();
        loadMockData();
    }

    private void loadMockData() {
        // ===================== TELUGU SONGS =====================

        // Telugu - Happy
        songDatabase.add(new Song("Butta Bomma", "happy", "https://www.youtube.com/results?search_query=Butta+Bomma+telugu+song", "telugu"));
        songDatabase.add(new Song("Ramuloo Ramulaa", "happy", "https://www.youtube.com/results?search_query=Ramuloo+Ramulaa+telugu+song", "telugu"));
        songDatabase.add(new Song("Saranga Dariya", "happy", "https://www.youtube.com/results?search_query=Saranga+Dariya+telugu+song", "telugu"));
        songDatabase.add(new Song("Naatu Naatu", "happy", "https://www.youtube.com/results?search_query=Naatu+Naatu+telugu+song", "telugu"));
        songDatabase.add(new Song("Samajavaragamana", "happy", "https://www.youtube.com/results?search_query=Samajavaragamana+telugu+song", "telugu"));
        songDatabase.add(new Song("Vachinde", "happy", "https://www.youtube.com/results?search_query=Vachinde+telugu+song", "telugu"));
        songDatabase.add(new Song("Mind Block", "happy", "https://www.youtube.com/results?search_query=Mind+Block+telugu+song", "telugu"));
        songDatabase.add(new Song("Oosupodu", "happy", "https://www.youtube.com/results?search_query=Oosupodu+telugu+song", "telugu"));

        // Telugu - Sad
        songDatabase.add(new Song("Nenani Neevani", "sad", "https://www.youtube.com/results?search_query=Nenani+Neevani+telugu+song", "telugu"));
        songDatabase.add(new Song("Oye Oye", "sad", "https://www.youtube.com/results?search_query=Oye+Oye+telugu+song", "telugu"));
        songDatabase.add(new Song("Kadalalle", "sad", "https://www.youtube.com/results?search_query=Kadalalle+telugu+song", "telugu"));
        songDatabase.add(new Song("Po Ve Po", "sad", "https://www.youtube.com/results?search_query=Po+Ve+Po+telugu+song", "telugu"));
        songDatabase.add(new Song("Evare", "sad", "https://www.youtube.com/results?search_query=Evare+telugu+song", "telugu"));
        songDatabase.add(new Song("Yenti Yenti", "sad", "https://www.youtube.com/results?search_query=Yenti+Yenti+telugu+song", "telugu"));
        songDatabase.add(new Song("Em Sandeham Ledu", "sad", "https://www.youtube.com/results?search_query=Em+Sandeham+Ledu+telugu+song", "telugu"));
        songDatabase.add(new Song("Nuvvostanante Nenddantana", "sad", "https://www.youtube.com/results?search_query=Nuvvostanante+Nenddantana+telugu+song", "telugu"));

        // Telugu - Love
        songDatabase.add(new Song("Inkem Inkem", "love", "https://www.youtube.com/results?search_query=Inkem+Inkem+telugu+song", "telugu"));
        songDatabase.add(new Song("Undiporaadhey", "love", "https://www.youtube.com/results?search_query=Undiporaadhey+telugu+song", "telugu"));
        songDatabase.add(new Song("Neeli Neeli Aakasam", "love", "https://www.youtube.com/results?search_query=Neeli+Neeli+Aakasam+telugu+song", "telugu"));
        songDatabase.add(new Song("Aradhya", "love", "https://www.youtube.com/results?search_query=Aradhya+telugu+song", "telugu"));
        songDatabase.add(new Song("Hoyna Hoyna", "love", "https://www.youtube.com/results?search_query=Hoyna+Hoyna+telugu+song", "telugu"));
        songDatabase.add(new Song("Priyathama Priyathama", "love", "https://www.youtube.com/results?search_query=Priyathama+Priyathama+telugu+song", "telugu"));
        songDatabase.add(new Song("Ninnu Kori", "love", "https://www.youtube.com/results?search_query=Ninnu+Kori+telugu+song", "telugu"));
        songDatabase.add(new Song("Oohalu Gusagusalade", "love", "https://www.youtube.com/results?search_query=Oohalu+Gusagusalade+telugu+song", "telugu"));

        // Telugu - Energetic
        songDatabase.add(new Song("Dimaak Kharaab", "energetic", "https://www.youtube.com/results?search_query=Dimaak+Kharaab+telugu+song", "telugu"));
        songDatabase.add(new Song("Boss Party", "energetic", "https://www.youtube.com/results?search_query=Boss+Party+telugu+song", "telugu"));
        songDatabase.add(new Song("Top Lesi Poddi", "energetic", "https://www.youtube.com/results?search_query=Top+Lesi+Poddi+telugu+song", "telugu"));
        songDatabase.add(new Song("Seeti Maar", "energetic", "https://www.youtube.com/results?search_query=Seeti+Maar+telugu+song", "telugu"));
        songDatabase.add(new Song("Ra Ra Reddy", "energetic", "https://www.youtube.com/results?search_query=Ra+Ra+Reddy+telugu+song", "telugu"));
        songDatabase.add(new Song("Ammadu Let's Do Kummudu", "energetic", "https://www.youtube.com/results?search_query=Ammadu+Lets+Do+Kummudu+telugu+song", "telugu"));
        songDatabase.add(new Song("Saami Saami", "energetic", "https://www.youtube.com/results?search_query=Saami+Saami+telugu+song", "telugu"));
        songDatabase.add(new Song("Daakko Daakko Meka", "energetic", "https://www.youtube.com/results?search_query=Daakko+Daakko+Meka+telugu+song", "telugu"));

        // ===================== HINDI SONGS =====================

        // Hindi - Happy
        songDatabase.add(new Song("Badtameez Dil", "happy", "https://www.youtube.com/results?search_query=Badtameez+Dil+hindi+song", "hindi"));
        songDatabase.add(new Song("Balam Pichkari", "happy", "https://www.youtube.com/results?search_query=Balam+Pichkari+hindi+song", "hindi"));
        songDatabase.add(new Song("Gallan Goodiyaan", "happy", "https://www.youtube.com/results?search_query=Gallan+Goodiyaan+hindi+song", "hindi"));
        songDatabase.add(new Song("Nagada Sang Dhol", "happy", "https://www.youtube.com/results?search_query=Nagada+Sang+Dhol+hindi+song", "hindi"));
        songDatabase.add(new Song("Tune Maari Entriyaan", "happy", "https://www.youtube.com/results?search_query=Tune+Maari+Entriyaan+hindi+song", "hindi"));
        songDatabase.add(new Song("Dilli Wali Girlfriend", "happy", "https://www.youtube.com/results?search_query=Dilli+Wali+Girlfriend+hindi+song", "hindi"));
        songDatabase.add(new Song("Ghagra", "happy", "https://www.youtube.com/results?search_query=Ghagra+hindi+song", "hindi"));
        songDatabase.add(new Song("London Thumakda", "happy", "https://www.youtube.com/results?search_query=London+Thumakda+hindi+song", "hindi"));

        // Hindi - Sad
        songDatabase.add(new Song("Tujhe Bhula Diya", "sad", "https://www.youtube.com/results?search_query=Tujhe+Bhula+Diya+hindi+song", "hindi"));
        songDatabase.add(new Song("Channa Mereya", "sad", "https://www.youtube.com/results?search_query=Channa+Mereya+hindi+song", "hindi"));
        songDatabase.add(new Song("Kabhi Alvida Naa Kehna", "sad", "https://www.youtube.com/results?search_query=Kabhi+Alvida+Naa+Kehna+hindi+song", "hindi"));
        songDatabase.add(new Song("Agar Tum Saath Ho", "sad", "https://www.youtube.com/results?search_query=Agar+Tum+Saath+Ho+hindi+song", "hindi"));
        songDatabase.add(new Song("Phir Mohabbat", "sad", "https://www.youtube.com/results?search_query=Phir+Mohabbat+hindi+song", "hindi"));
        songDatabase.add(new Song("Judaai", "sad", "https://www.youtube.com/results?search_query=Judaai+Badlapur+hindi+song", "hindi"));
        songDatabase.add(new Song("Tum Hi Ho", "sad", "https://www.youtube.com/results?search_query=Tum+Hi+Ho+hindi+song", "hindi"));
        songDatabase.add(new Song("Hamari Adhuri Kahani", "sad", "https://www.youtube.com/results?search_query=Hamari+Adhuri+Kahani+hindi+song", "hindi"));

        // Hindi - Love
        songDatabase.add(new Song("Raabta", "love", "https://www.youtube.com/results?search_query=Raabta+Agent+Sai+hindi+song", "hindi"));
        songDatabase.add(new Song("Tera Ban Jaunga", "love", "https://www.youtube.com/results?search_query=Tera+Ban+Jaunga+hindi+song", "hindi"));
        songDatabase.add(new Song("Ae Dil Hai Mushkil", "love", "https://www.youtube.com/results?search_query=Ae+Dil+Hai+Mushkil+hindi+song", "hindi"));
        songDatabase.add(new Song("Gerua", "love", "https://www.youtube.com/results?search_query=Gerua+hindi+song", "hindi"));
        songDatabase.add(new Song("Tere Sang Yaara", "love", "https://www.youtube.com/results?search_query=Tere+Sang+Yaara+hindi+song", "hindi"));
        songDatabase.add(new Song("Ik Vaari Aa", "love", "https://www.youtube.com/results?search_query=Ik+Vaari+Aa+hindi+song", "hindi"));
        songDatabase.add(new Song("Pehli Nazar Mein", "love", "https://www.youtube.com/results?search_query=Pehli+Nazar+Mein+hindi+song", "hindi"));
        songDatabase.add(new Song("Tujh Mein Rab Dikhta Hai", "love", "https://www.youtube.com/results?search_query=Tujh+Mein+Rab+Dikhta+Hai+hindi+song", "hindi"));

        // Hindi - Energetic
        songDatabase.add(new Song("Malang", "energetic", "https://www.youtube.com/results?search_query=Malang+hindi+song", "hindi"));
        songDatabase.add(new Song("Kar Gayi Chull", "energetic", "https://www.youtube.com/results?search_query=Kar+Gayi+Chull+hindi+song", "hindi"));
        songDatabase.add(new Song("Zinda", "energetic", "https://www.youtube.com/results?search_query=Zinda+Bhaag+Milkha+hindi+song", "hindi"));
        songDatabase.add(new Song("Dhan Te Nan", "energetic", "https://www.youtube.com/results?search_query=Dhan+Te+Nan+hindi+song", "hindi"));
        songDatabase.add(new Song("Jai Jai Shiv Shankar", "energetic", "https://www.youtube.com/results?search_query=Jai+Jai+Shiv+Shankar+War+hindi+song", "hindi"));
        songDatabase.add(new Song("Simmba Aankh Marey", "energetic", "https://www.youtube.com/results?search_query=Aankh+Marey+Simmba+hindi+song", "hindi"));
        songDatabase.add(new Song("Ghungroo", "energetic", "https://www.youtube.com/results?search_query=Ghungroo+War+hindi+song", "hindi"));
        songDatabase.add(new Song("Befikre", "energetic", "https://www.youtube.com/results?search_query=Befikre+hindi+song", "hindi"));
    }

    /**
     * Gets a list of recommendations based on the provided mood, language, and optional exclusions.
     * @param mood the mood string
     * @param language the language ("telugu" or "hindi")
     * @param excludeNames list of song names to exclude (can be null)
     * @return List of matching songs
     */
    public List<Song> getRecommendationsByMood(String mood, String language, List<String> excludeNames) {
        List<Song> recommendations = new ArrayList<>();
        if (mood == null) {
            return recommendations;
        }

        String searchMood = mood.toLowerCase().trim();
        String searchLang = (language != null) ? language.toLowerCase().trim() : "telugu";

        for (Song song : songDatabase) {
            if (song.getMood().equals(searchMood) && song.getLanguage().equals(searchLang)) {
                if (excludeNames == null || !excludeNames.contains(song.getName())) {
                    recommendations.add(song);
                }
            }
        }

        // If we ran out of new songs, loop around and return without exclusions
        if (recommendations.isEmpty() && excludeNames != null && !excludeNames.isEmpty()) {
            return getRecommendationsByMood(mood, language, null);
        }

        Collections.shuffle(recommendations);
        if (recommendations.size() > 3) {
            return recommendations.subList(0, 3);
        }
        return recommendations;
    }
}
