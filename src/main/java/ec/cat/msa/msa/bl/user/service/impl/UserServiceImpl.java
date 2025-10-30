package ec.cat.msa.msa.bl.user.service.impl;

import ec.cat.msa.msa.bl.user.domain.User;
import ec.cat.msa.msa.bl.user.repository.UserEntityRepository;
import ec.cat.msa.msa.bl.user.service.UserService;
import ec.cat.msa.msa.bl.user.service.mapper.UserEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserEntityRepository userEntityRepository;

    @Override
    public User save(User user) {
        userEntityRepository.save(UserEntityMapper.INSTANCE.toUserEntity(user));
        return null;
    }
}
