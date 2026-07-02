package com.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MusicController {

    private final MusicService musicService;

    @Autowired
    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @GetMapping("/")
    public String index(@RequestParam(value = "mood", required = false) String mood,
                        @RequestParam(value = "language", defaultValue = "telugu") String language,
                        HttpSession session, 
                        Model model) {
        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }
        model.addAttribute("username", session.getAttribute("user"));
        model.addAttribute("selectedLanguage", language);
        
        if (mood != null && !mood.isEmpty()) {
            List<Song> recommendedSongs = musicService.getRecommendationsByMood(mood, language, null);
            model.addAttribute("selectedMood", mood);
            model.addAttribute("songs", recommendedSongs);
        }
        return "index";
    }

    @GetMapping("/login")
    public String loginPage(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return "redirect:/";
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session,
                        Model model) {
        if ("Geethika".equals(username) && "123".equals(password)) {
            session.setAttribute("user", username);
            return "redirect:/";
        } else {
            model.addAttribute("error", "Invalid username or password.");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    @PostMapping("/recommend")
    public String recommend(@RequestParam("mood") String mood,
                            @RequestParam(value = "language", defaultValue = "telugu") String language,
                            @RequestParam(value = "exclude", required = false) List<String> exclude,
                            HttpSession session,
                            Model model) {
        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }

        List<Song> recommendedSongs = musicService.getRecommendationsByMood(mood, language, exclude);
        model.addAttribute("username", session.getAttribute("user"));
        model.addAttribute("selectedMood", mood);
        model.addAttribute("selectedLanguage", language);
        model.addAttribute("songs", recommendedSongs);
        return "index";
    }
}
