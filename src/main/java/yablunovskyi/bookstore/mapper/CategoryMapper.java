package yablunovskyi.bookstore.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import yablunovskyi.bookstore.dto.category.CategoryRequestDto;
import yablunovskyi.bookstore.dto.category.CategoryResponseDto;
import yablunovskyi.bookstore.model.Category;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface CategoryMapper {
    CategoryResponseDto toDto(Category category);
    
    Category toCategory(CategoryRequestDto requestDto0);
    
    void updateRequestDtoToCategory(
            CategoryRequestDto requestDto, @MappingTarget Category category);
}
