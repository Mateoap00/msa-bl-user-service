package ec.cat.msa.msa.bl.user.service.mapper;

import ec.cat.msa.msa.bl.user.domain.User;
import ec.cat.msa.msa.bl.user.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserEntityMapper {
    UserEntityMapper INSTANCE = Mappers.getMapper(UserEntityMapper.class);
    UserEntity toUserEntity(User user);
}
