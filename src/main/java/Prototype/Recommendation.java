package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Prototype{
    private String targetAudience;
    private List<Prototype> recommendations;

    public Recommendation(String targetAudience, List<Prototype> recommendations) {
        this.targetAudience = targetAudience;
        this.recommendations = recommendations;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }
    public List<Prototype> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Prototype> recommendations) {
        this.recommendations = recommendations;
    }

    public void addBook(Prototype book) {
        recommendations.add(book);
    }

    public void removeBook(Prototype book) {
        recommendations.remove(book);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Recommendation for " + targetAudience + ":\n");
        for (Prototype book : recommendations) {
            sb.append(" - ").append(book).append("\n");
        }
        return sb.toString();
    }

    public Prototype clone() {
        List<Prototype> clonedRecommendations = new ArrayList<>();
        for (Prototype p : recommendations) {
            clonedRecommendations.add(p.clone());
        }
        return new Recommendation(targetAudience, clonedRecommendations);
    }
}
