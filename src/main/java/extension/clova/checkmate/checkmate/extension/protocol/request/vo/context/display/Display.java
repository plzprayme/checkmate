package extension.clova.checkmate.checkmate.extension.protocol.request.vo.context.display;

public record Display(
        String size,
        String orientation,
        Integer dpi,
        ContentLayer contentLayer
) {
    private record ContentLayer(
            Integer width,
            Integer height
    ) {}
}
