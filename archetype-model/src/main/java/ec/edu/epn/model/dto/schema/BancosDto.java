package ec.edu.epn.model.dto.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BancosDto implements Serializable {
    private static final long serialVersionUID = 396144332890469378L;

    private Integer id_bancos;
    private String nombre_bancos;
    private String desc_bancos  ;
    private String estado_bancos;
    private Date fecha_bancos;
    private int id_usuario_bancos;

}
