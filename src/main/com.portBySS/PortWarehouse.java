import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PortWarehouse {

    private List<Container>containers;

    public static int getMaxVolume() {
        return MAX_VOLUME;
    }

    private static final int MAX_VOLUME = 1000;
}
