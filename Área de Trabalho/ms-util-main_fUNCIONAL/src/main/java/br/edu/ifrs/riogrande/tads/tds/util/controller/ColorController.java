package br.edu.ifrs.riogrande.tads.tds.util.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ColorController {

    @GetMapping("/rgb-to-hsl")
    public String convertRgbToHsl(@RequestParam String rgb) {
        if (!rgb.matches("^([A-Fa-f0-9]{6})$")) {
            return "Formato inválido. Use RRGGBB.";
        }

        // 0123456
        // A012F2
        int r = Integer.parseInt(rgb.substring(0, 2), 16);
        int g = Integer.parseInt(rgb.substring(2, 4), 16);
        int b = Integer.parseInt(rgb.substring(4, 6), 16);

        float rf = r / 255f;
        float gf = g / 255f;
        float bf = b / 255f;

        float max = Math.max(rf, Math.max(gf, bf));
        float min = Math.min(rf, Math.min(gf, bf));
        float h, s, l;
        l = (max + min) / 2;

        if (max == min) {
            h = s = 0; // achromatic
        } else {
            float d = max - min;
            s = l > 0.5 ? d / (2 - max - min) : d / (max + min);
            if (max == rf) {
                h = (gf - bf) / d + (gf < bf ? 6 : 0);
            } else if (max == gf) {
                h = (bf - rf) / d + 2;
            } else {
                h = (rf - gf) / d + 4;
            }
            h /= 6;
        }

        int H = Math.round(h * 360);
        int S = Math.round(s * 100);
        int L = Math.round(l * 100);

        return String.format("HSL(%d, %d%%, %d%%)", H, S, L);
    }
}
