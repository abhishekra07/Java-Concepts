## Counting:
Counting is used to count number of elements in the stream.It returns Collector instance which can be accepted by collect method.
Collectors.counting()

## AveragingInt :
AveragingInt is used to find average of stream elements as int datatype. It returns Collector instance which can be accepted by collect method.
Collectors.averagingInt()

## joining
Joining method is used to concatenate with delimiter, you can also pass prefix and suffix.
Collectors.joining()

## summingint:
summingInt is used to find sum of stream elements as int datatype. It returns Collector instance which can be accepted by collect method.
Collectors.summingInt()

## collectingAndThen:
collectingAndThen: is used to get a Collector instance and perform finishing function on top of it.
Collectors.collectingAndThen()

## Collectors.groupBy
Collectors.groupingBy()