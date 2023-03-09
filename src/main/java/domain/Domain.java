package domain;

import entity.Doctor;
import entity.Patient;
import entity.Ward;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.DoctorRepository;
import repository.PatientRepository;
import repository.WardRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Domain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        DoctorRepository doctorRepository = context.getBean(DoctorRepository.class);
        PatientRepository patientRepository = context.getBean(PatientRepository.class);
        WardRepository wardRepository = context.getBean(WardRepository.class);

        Ward ward = new Ward();
        ward.setId(7L);
        ward.setWard("Psiho");

        Doctor doctor = new Doctor();
        doctor.setId(1L);
        doctor.setNameDoctor("Hanibal");
        doctor.setSurnameDoctor("Lector");
        doctor.setSpeciality("Hirurg");

        Patient patient = new Patient();
        patient.setId(666L);
        patient.setNamePatient("huylo");
        patient.setSurnamePatient("pupkin");
        patient.setTelephone("zvonit v ochko");
        patient.setWard(ward);

        Set<Patient> ptients = new HashSet<Patient>();
        ptients.add(patient);
        doctor.setPatients(ptients);

        Set<Doctor> doctors = new HashSet<Doctor>();
        doctors.add(doctor);
        patient.setDoctors(doctors);

        doctorRepository.save(doctor);
        patientRepository.save(patient);
        wardRepository.save(ward);

        System.out.println(patientRepository.findByNamePatientAndSurnamePatient("huylo","pupkin"));
        System.out.println("find all");
        List<Patient> patientList = patientRepository.findAll();
        for (Patient e:patientList){
            System.out.println(e);
        }
        System.out.println("find one");
        System.out.println(patientRepository.findBySurnamePatient("huylo"));
    }
}
