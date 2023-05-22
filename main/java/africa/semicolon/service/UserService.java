package africa.semicolon.service;

import africa.semicolon.data.dto.request.EligibleRequest;
import africa.semicolon.data.dto.response.UserResponse;

//public interface UserService {
//    UserResponse registerVoting(EligibleRequest request);
//
//
//}


// public class BvasPartyService implements PartyService{
//    private final PartyRepository partyRepository = new BvasPartyRepository();
//    @Override
//    public PartyRegistrationResponse registerParty(PartyRegistrationRequest partyRegistrationRequest) throws PartyRegistrationException {
//        Party newParty = ModelMapper.map(partyRegistrationRequest);
//        Party savedParty = partyRepository.save(newParty);
//
//        if(savedParty == null) throw new PartyRegistrationException("Registration unsuccessful");
//
//        PartyRegistrationResponse partyRegistrationResponse =
//                new PartyRegistrationResponse();
//        partyRegistrationResponse.setMessage("Registration successful.");
//        return partyRegistrationResponse;
//    }
//
//    @Override
//    pub…
//
//        public static Election map(CreateElectionRequest createElectionRequest){
////        Election election = new Election();
////        Catergory electionCategory = Catergory.valueOf(createElectionRequest.getElectionCategory().toUpperCase());
////        election.setCatergory(electionCategory);
////        LocalDate electionDate = LocalDate.parse(createElectionRequest.getElecti…

//class BvasPartyServiceTest {
//                private final PartyService partyService = new BvasPartyService();
//                private PartyRegistrationRequest partyRegistrationRequest;
//
//                @BeforeEach
//                void setUp(){
//                    partyRegistrationRequest = buildPartyRegistration();
//                }
//
//
//                @Test
//                void testToRegisterParty(){
//                    try{
//                        PartyRegistrationResponse registrationResponse =
//                                partyService.registerParty(partyRegistrationRequest);
//                        assertNotNull(registrationResponse);
//                    } catch (PartyRegistrationException ex){
//                        System.out.println(ex.getMessage());
//                    }
//                }
//                @Test
//                void testToFindPartyById() throws PartyRegistrationException {
//                    var registrationResponse = partyService.registerParty(partyRegis…
//                             class BvasAdminServiceTest {
//                        private final AdminService adminService = new BvasAdminService();
//                        private AdminRegistrationRequest adminRegistrationRequest = new AdminRegistrationRequest();
//
//
//                        @BeforeEach
//                        void setUp(){ adminRegistrationRequest = buildAdminRegistration(); }
//
//                        @Test
//                        void testToRegisterAdmin(){
//                            try{
//                                AdminRegistrationResponse adminRegistrationResponse
//                                        = adminService.registerAdmin(adminRegistrationRequest);
//                                assertNotNull(adminRegistrationResponse);
//                            } catch (AdminRegistrationException ex){
//                                System.out.println(ex.getMessage());
//                            }
//                        }
//
//                        @Test
//                        void testToFindAdminById() throws AdminRegistrationException {
//                            adminService.registerAdmin(adminR…
//                                     public class BvasAdminService implements AdminService{
//                                private final AdminRepository adminRepository = new BvasAdminRepository();
//                                @Override
//                                public AdminRegistrationResponse registerAdmin(africa.semicolon.IdealBvas.dto.request.AdminRegistrationRequest adminRegistrationRequest) throws AdminRegistrationException {
//                                    Admin newAdmin = ModelMapper.map(adminRegistrationRequest);
//                                    Admin saveAdmin = adminRepository.save(newAdmin);
//
//                                    if(saveAdmin == null) throw new AdminRegistrationException("Registration unsuccessful");
//
//                                    AdminRegistrationResponse adminRegistrationResponse =
//                                            new AdminRegistrationResponse();
//                                    adminRegistrationResponse.setMessage("Registration successful");
//                                    return adminRegistrationRe…