package hello.itemservice.web.validation.form;

import hello.itemservice.domain.item.SaveCheck;
import hello.itemservice.domain.item.UpdateCheck;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ItemSaveForm {

        @NotBlank
        private String itemName;

        @NotNull
        @Range(min=1000, max=1000000)
        private Integer price;

        @NotNull
        @Max(value = 9999) //등록시에만 적용
        private Integer quantity;
}
