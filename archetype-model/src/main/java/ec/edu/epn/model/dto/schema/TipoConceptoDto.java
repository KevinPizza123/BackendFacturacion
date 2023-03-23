package ec.edu.epn.model.dto.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoConceptoDto implements Serializable {


    private static final long serialVersionUID = -694396375016514268L;


    private Date fechaTc;

    private int idUsuarioTc;
}
