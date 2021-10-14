package com.ssu.hospital.DependencyInjection;


import com.ssu.hospital.dao.*;
import com.ssu.hospital.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppContextConfig {
    @Bean
    public UserRepository userRepository() {
        return new com.ssu.hospital.dao.fakeImpl.UserRepository();
    }

    @Bean
    public DoctorRepository doctorRepository() {
        return new com.ssu.hospital.dao.fakeImpl.DoctorRepository();
    }

    @Bean
    public AppointmentRepository appointmentService() {
        return new com.ssu.hospital.dao.fakeImpl.AppointmentRepository();
    }

    @Bean
    public UserService userService() {
        return new com.ssu.hospital.service.impl.UserService();
    }

    @Bean
    public DoctorService doctorService() {
        return new com.ssu.hospital.service.impl.DoctorService();
    }

    @Bean
    public AppointmentService appointmentRepository() {
        return new com.ssu.hospital.service.impl.AppointmentService();
    }
}
