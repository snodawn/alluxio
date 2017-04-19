/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TExceptionStatus implements org.apache.thrift.TEnum {
  OK(0),
  CANCELED(1),
  UNKNOWN(2),
  INVALID_ARGUMENT(3),
  DEADLINE_EXCEEDED(4),
  NOT_FOUND(5),
  ALREADY_EXISTS(6),
  PERMISSION_DENIED(7),
  UNAUTHENTICATED(16),
  RESOURCE_EXHAUSTED(8),
  FAILED_PRECONDITION(9),
  ABORTED(10),
  OUT_OF_RANGE(11),
  UNIMPLEMENTED(12),
  INTERNAL(13),
  UNAVAILABLE(14),
  DATA_LOSS(15);

  private final int value;

  private TExceptionStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TExceptionStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return OK;
      case 1:
        return CANCELED;
      case 2:
        return UNKNOWN;
      case 3:
        return INVALID_ARGUMENT;
      case 4:
        return DEADLINE_EXCEEDED;
      case 5:
        return NOT_FOUND;
      case 6:
        return ALREADY_EXISTS;
      case 7:
        return PERMISSION_DENIED;
      case 16:
        return UNAUTHENTICATED;
      case 8:
        return RESOURCE_EXHAUSTED;
      case 9:
        return FAILED_PRECONDITION;
      case 10:
        return ABORTED;
      case 11:
        return OUT_OF_RANGE;
      case 12:
        return UNIMPLEMENTED;
      case 13:
        return INTERNAL;
      case 14:
        return UNAVAILABLE;
      case 15:
        return DATA_LOSS;
      default:
        return null;
    }
  }
}
