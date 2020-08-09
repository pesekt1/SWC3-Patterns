package behavioral.visitor;

public interface AudioFilter {
    void apply(FormatSegment formatSegment);
    void apply(FactSegment factSegment);
}
