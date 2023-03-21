package ec.edu.epn.model.dto.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CentroCostoDto implements Serializable {
    private static final long serialVersionUID = -231587805402151167L;

    private Integer id_centro_costo;
    private String cod_centro_costo;
    private String nombre_centro_costo;
    private String desc_centro_costo;
    private String estado_centro_costo;
    private Date fecha_centro_costo;
    private int id_usuario_centro_costo;

}
