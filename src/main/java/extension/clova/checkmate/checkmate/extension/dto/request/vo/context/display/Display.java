package extension.clova.checkmate.checkmate.extension.dto.request.vo.context.display;

public class Display {
    String size;
    String orientation;
    Integer dpi;
    ContentLayer contentLayer;

    private static class ContentLayer {
        Integer width;
        Integer height;
    }
}
