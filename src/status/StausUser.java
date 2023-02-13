/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StatusUser 
{

    public enum UserStatus {
      REJECTED,
      PENDING,
      PROCESSING,
      APPROVED,
      NOT_VALID,
    };

    public UserStatus userStatus;

   public void statusDetail(UserStatus e)


{
switch(userStatus)
        {
        case REJECTED: System.out.println("REJECTED");
        break;
        case PENDING: System.out.println("PENDING");
        break;
        case PROCESSING:
        System.out.println("PROCESSING");
        break;
        case APPROVED: 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
