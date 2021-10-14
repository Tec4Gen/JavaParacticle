package DependenciesInjection;

import dao.AppointmentRepository;
import dao.DoctorRepository;
import dao.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import services.impl.AppointmentService;
import services.impl.DoctorService;
import services.impl.UserService;

@Configuration
@ComponentScan
public class AppContextConfig {
    @Bean
    public UserRepository userRepository() {
        return new dao.fakeImpl.UserRepository();
    }

    @Bean
    public DoctorRepository doctorRepository() {
        return new dao.fakeImpl.DoctorRepository();
    }

    @Bean
    public AppointmentRepository appointmentService() {
        return new dao.fakeImpl.AppointmentRepository();
    }

    @Bean
    public services.UserService userService() {
        return new UserService();
    }

    @Bean
    public DoctorService doctorService() {
        return new DoctorService();
    }

    @Bean
    public services.AppointmentService appointmentRepository() {
        return new AppointmentService();
    }
}
